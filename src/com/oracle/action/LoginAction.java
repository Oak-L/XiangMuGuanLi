package com.oracle.action;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbEmp;
import com.oracle.service.TbEmpService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!request.getParameter("randomCode").equals(request.getSession().getAttribute("randomCode"))) {
			System.out.println("验证码错误");
			return "loginFail";
		} else {
			System.out.println("验证码正确");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			List<TbEmp> list = new TbEmpService().selectByExample(username, password);
			if (list.size() == 0) {
				System.out.println("账号错误");
				request.setAttribute("msg", "登录失败，用户名或密码错误");
				return "loginFail";
			} else {
				System.out.println("账号正确");
				TbEmp emp = list.get(0);
				// 向session里面放值
				request.getSession().setAttribute("emp", emp);
				return "loginSuccess";
			}
		}
	}
}
