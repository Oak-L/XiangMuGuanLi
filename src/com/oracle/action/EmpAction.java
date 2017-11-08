package com.oracle.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbEmp;
import com.oracle.service.TbEmpService;

public class EmpAction extends ActionSupport {
	private List<TbEmp> list;
	// private String empName;
	private int id;
	private TbEmp emp;
	private List<Integer> delid;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String list() throws Exception {
		list = new TbEmpService().selectAll();
		return "list";
	}

	public String update() throws Exception {
		System.out.println(emp.getEmpid());
		int i = 0;
		if (emp.getEmpid() != null) {
			i = new TbEmpService().updateByPrimaryKey(emp);
		} else {
			i = new TbEmpService().add(emp);
		}
		System.out.println(i);
		return "listAgain";
	}

	// public String msg() throws Exception {
	// emp = new TbEmpService().selectByPrimaryKey(id);
	// return "msg";
	// }

	public String updateFind() throws Exception {
		if (id != 0) {
			emp = new TbEmpService().selectByPrimaryKey(id);
		}
		return "update";
	}

	public String delete() throws Exception {
		if (delid != null) {
			int i = new TbEmpService().deleteByExample(delid);
			System.out.println(i);
		}
		return "listAgain";
	}

	public List<Integer> getDelid() {
		return delid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDelid(List<Integer> delid) {
		this.delid = delid;
	}

	public List<TbEmp> getList() {
		return list;
	}

	public void setList(List<TbEmp> list) {
		this.list = list;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TbEmp getEmp() {
		return emp;
	}

	public void setEmp(TbEmp emp) {
		this.emp = emp;
	}

}
