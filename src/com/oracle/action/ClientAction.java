package com.oracle.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbCompany;
import com.oracle.service.TbCompanyService;

public class ClientAction extends ActionSupport {
	private List<TbCompany> list;
	private String companyName;
	private int id;
	private TbCompany company;
	private List<Integer> delid;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String list() throws Exception {
		list = new TbCompanyService().selectAll();
		return "list";
	}

	public String find() throws Exception {
		list = new TbCompanyService().selectFind(companyName);
		return "list";
	}

	public String add() throws Exception {
		System.out.println(company.getCompanyid());
		TbCompany tbCompany = new TbCompany();
		int i = 0;
		tbCompany.setCompanyname(company.getCompanyname());
		tbCompany.setLinkman(company.getLinkman());
		tbCompany.setTel(company.getTel());
		tbCompany.setAddress(company.getAddress());
		tbCompany.setDescript(company.getDescript());
		tbCompany.setCreatedate(new Date());
		if (company.getCompanyid() != null) {
			tbCompany.setCompanyid(company.getCompanyid());
			i = new TbCompanyService().updateByPrimaryKey(tbCompany);
		} else {
			i = new TbCompanyService().add(tbCompany);
		}
		System.out.println(i);
		return "listAgain";
	}

	public String msg() throws Exception {
		company = new TbCompanyService().selectByPrimaryKey(id);
		return "msg";
	}

	public String updateFind() throws Exception {
		if (company.getCompanyid() != null) {
			company = new TbCompanyService().selectByPrimaryKey(company.getCompanyid());
		}
		return "update";
	}

	public String delete() throws Exception {
		System.out.println(delid);
		int i = new TbCompanyService().deleteByExample(delid);
		System.out.println(i);
		return "listAgain";
	}

	public List<TbCompany> getList() {
		return list;
	}

	public void setList(List<TbCompany> list) {
		this.list = list;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TbCompany getCompany() {
		return company;
	}

	public void setCompany(TbCompany company) {
		this.company = company;
	}

	public List<Integer> getDelid() {
		return delid;
	}

	public void setDelid(List<Integer> delid) {
		this.delid = delid;
	}

}
