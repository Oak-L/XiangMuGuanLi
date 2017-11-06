package com.oracle.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbRight;
import com.oracle.po.TbRole;
import com.oracle.service.TbRightService;
import com.oracle.service.ToRightroleService;

public class RightAction extends ActionSupport {
	private List<TbRight> list;
	private List<TbRight> mylist;
	private TbRole role;
	private List<Integer> delid;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String list() throws Exception {
		TbRightService tbRightService = new TbRightService();
		list = tbRightService.selectAll();
		mylist = tbRightService.selectByTorightrole(role.getRoleid());
		return "list";
	}

	public String update() throws Exception {
		ToRightroleService toRightroleService = new ToRightroleService();
		toRightroleService.update(delid, role);
		return "listAgain";
	}

	public List<TbRight> getList() {
		return list;
	}

	public void setList(List<TbRight> list) {
		this.list = list;
	}

	public List<TbRight> getMylist() {
		return mylist;
	}

	public void setMylist(List<TbRight> mylist) {
		this.mylist = mylist;
	}

	public List<Integer> getDelid() {
		return delid;
	}

	public void setDelid(List<Integer> delid) {
		this.delid = delid;
	}

	public TbRole getRole() {
		return role;
	}

	public void setRole(TbRole role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
