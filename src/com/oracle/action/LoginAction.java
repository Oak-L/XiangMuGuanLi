package com.oracle.action;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbEmp;
import com.oracle.service.TbEmpService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String login() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!request.getParameter("randomCode").equals(request.getSession().getAttribute("randomCode"))) {
			String error = "验证码有误，请重新输入！";
			ServletActionContext.getRequest().setAttribute("error", error);
			return "loginFail";
		} else {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			List<TbEmp> list = new TbEmpService().selectByExample(username, password);
			if (list.size() == 0) {
				String error = "账号密码有误，请重新输入！";
				ServletActionContext.getRequest().setAttribute("error", error);
				return "loginFail";
			} else {
				// 向session里面放值
				request.getSession().setAttribute("emp", list.get(0));
				return "loginSuccess";
			}
		}
	}

	public String logout() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		TbEmp emp = (TbEmp) session.getAttribute("emp");
		if (null != emp) {
			session.removeAttribute("emp");
		}
		return "loginFail";
	}
}
