package com.oracle.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TaskAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String add() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		return "ok";
	}
}
