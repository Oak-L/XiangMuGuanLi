package com.oracle.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbCompany;
import com.oracle.service.TbCompanyService;

public class TaskAction extends ActionSupport {
	// private List<TbCompany> list;
	// private String companyName;
	// private int id;
	// private TbCompany company;
	// private List<Integer> delid;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String list() throws Exception {
		// list = new TbCompanyService().selectAll();
		return "list";
	}

	public String toAdd() throws Exception {
		return "toAdd";
	}

	// public String find() throws Exception {
	// list = new TbCompanyService().selectFind(companyName);
	// return "list";
	// }
	//
	// public String add() throws Exception {
	// System.out.println(company.getCompanyid());
	// TbCompany tbCompany = new TbCompany();
	// int i = 0;
	// tbCompany.setCompanyname(company.getCompanyname());
	// tbCompany.setLinkman(company.getLinkman());
	// tbCompany.setTel(company.getTel());
	// tbCompany.setAddress(company.getAddress());
	// tbCompany.setDescript(company.getDescript());
	// tbCompany.setCreatedate(new Date());
	// if (company.getCompanyid() != null) {
	// tbCompany.setCompanyid(company.getCompanyid());
	// i = new TbCompanyService().updateByPrimaryKey(tbCompany);
	// } else {
	// i = new TbCompanyService().add(tbCompany);
	// }
	// System.out.println(i);
	// return "listAgain";
	// }
	//
	// public String msg() throws Exception {
	// company = new TbCompanyService().selectByPrimaryKey(id);
	// return "msg";
	// }
	//
	// public String updateFind() throws Exception {
	// if (company != null) {
	// company = new TbCompanyService().selectByPrimaryKey(company.getCompanyid());
	// }
	// return "update";
	// }
	//
	// public String delete() throws Exception {
	// if (delid != null) {
	// int i = new TbCompanyService().deleteByExample(delid);
	// System.out.println(i);
	// }
	// return "listAgain";
	// }

}
