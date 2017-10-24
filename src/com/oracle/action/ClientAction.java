package com.oracle.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbCompany;
import com.oracle.service.TbCompanyService;

public class ClientAction extends ActionSupport {
	private List<TbCompany> list;
	private String companyName;
	private String name;
	private String linkman;
	private String telephone;
	private String address;
	private String descript;
	private int id;
	private TbCompany company;
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
		TbCompany tbCompany = new TbCompany();
		tbCompany.setCompanyname(name);
		tbCompany.setLinkman(linkman);
		tbCompany.setTel(telephone);
		tbCompany.setAddress(address);
		tbCompany.setCreatedate(new Date());
		tbCompany.setDescript(descript);
		int i = new TbCompanyService().add(tbCompany);
		System.out.println(i);
		return "list";
	}

	public String msg() throws Exception {
		company = new TbCompanyService().selectByPrimaryKey(id);
		return "msg";
	}

	public String updateFind() throws Exception {
		if (id != 0) {
			company = new TbCompanyService().selectByPrimaryKey(id);
		}
		return "update";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
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

}
