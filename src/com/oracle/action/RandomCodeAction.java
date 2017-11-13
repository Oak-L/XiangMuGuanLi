﻿package com.oracle.action;

import java.awt.*;
import java.awt.image.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class RandomCodeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int width = 60; // 图片宽度
	private final int height = 20; // 图片高度

	public void get() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = buffImg.createGraphics();
		g.setColor(Color.WHITE); // 背景颜色
		g.fillRect(0, 0, width, height);
		Font font = new Font("Times New Roman", Font.PLAIN, 22);
		g.setFont(font); // 设置字体，字号与图片高度相关
		g.setColor(Color.black); // 图片边框
		g.drawRect(0, 0, width - 1, height - 1);
		g.setColor(Color.gray); // 干扰线颜色
		for (int i = 0; i < 16; i++) { // 随机产生16条干扰线
			int x = (int) (Math.random() * width);
			int y = (int) (Math.random() * height);
			int x1 = (int) (Math.random() * 12);
			int y1 = (int) (Math.random() * 12);
			g.drawLine(x, y, x + x1, y + y1);
		}
		StringBuffer randomCode = new StringBuffer();
		for (int i = 0; i < 4; i++) { // 随机产生4位数字的验证玛
			String strRand = String.valueOf((int) (Math.random() * 10));
			// 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色都不一样
			int red = (int) (Math.random() * 255);
			int green = (int) (Math.random() * 255);
			int blue = (int) (Math.random() * 255);
			g.setColor(new Color(red, green, blue));
			g.drawString(strRand, 13 * i + 6, 16);
			randomCode.append(strRand); // 将产生的四个随机数组合起来
		}
		// 将四位数字保存到session中
		HttpSession session = request.getSession();
		session.setAttribute("randomCode", randomCode.toString());
		// 禁止图像的缓存
		response.setHeader("Cache-Control", "no-cache");
		response.setContentType("image/jpeg");
		// 将图像输出到servlet输出流中
		ServletOutputStream sos = response.getOutputStream();
		javax.imageio.ImageIO.write(buffImg, "jpeg", sos);
		sos.close();
	}
}
