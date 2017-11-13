package com.oracle.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbEmp;
import com.oracle.po.TbSendmessage;
import com.oracle.service.TbMessageService;

public class MessageAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TbSendmessage message;
	private String empname;
	private List<TbSendmessage> list;
	private List<Integer> delid;

	public String toSend() throws Exception {
		return "send";
	}

	public String send() throws Exception {
		message.setCreatedate(new Date());
		int i = new TbMessageService().send(message);
		System.out.println(i);
		return "yes";
	}

	public String toListSend() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		TbEmp cemp = (TbEmp) request.getSession().getAttribute("cemp");
		list = new TbMessageService().listSend(cemp.getEmpname());
		return "listSend";
	}

	public String toListGet() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		TbEmp cemp = (TbEmp) request.getSession().getAttribute("cemp");
		list = new TbMessageService().listGet(cemp.getEmpno());
		return "listGet";
	}

	public String toListAll() throws Exception {
		list = new TbMessageService().listAll();
		return "listAll";
	}

	public String delete() throws Exception {
		if (delid != null) {
			int i = new TbMessageService().deleteByExample(delid);
			System.out.println(i);
		}
		return "yes";
	}

	public String find() throws Exception {
		message = new TbMessageService().find(message.getSendid());
		return "find";
	}

	public TbSendmessage getMessage() {
		return message;
	}

	public void setMessage(TbSendmessage message) {
		this.message = message;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public List<TbSendmessage> getList() {
		return list;
	}

	public void setList(List<TbSendmessage> list) {
		this.list = list;
	}

	public List<Integer> getDelid() {
		return delid;
	}

	public void setDelid(List<Integer> delid) {
		this.delid = delid;
	}

}