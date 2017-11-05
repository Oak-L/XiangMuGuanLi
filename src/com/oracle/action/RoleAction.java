package com.oracle.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.TbRole;
import com.oracle.service.TbRoleService;

public class RoleAction extends ActionSupport {
	private List<TbRole> list;
	private String roleName;
	private int id;
	private TbRole role;
	private List<Integer> delid;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String list() throws Exception {
		list = new TbRoleService().selectAll();
		return "list";
	}

	public String find() throws Exception {
		list = new TbRoleService().selectFind(roleName);
		return "list";
	}

	public String add() throws Exception {
		System.out.println(role.getRoleid());
		TbRole tbrole = new TbRole();
		int i = 0;
		tbrole.setRolename(role.getRolename());
		tbrole.setRoledesc(role.getRoledesc());
		if (role.getRoleid() != null) {
			tbrole.setRoleid(role.getRoleid());
			i = new TbRoleService().updateByPrimaryKey(tbrole);
		} else {
			i = new TbRoleService().add(tbrole);
		}
		System.out.println(i);
		return "listAgain";
	}

	public String msg() throws Exception {
		role = new TbRoleService().selectByPrimaryKey(id);
		return "msg";
	}

	public String updateFind() throws Exception {
		if (role.getRoleid() != null) {
			role = new TbRoleService().selectByPrimaryKey(role.getRoleid());
		}
		return "update";
	}

	public String delete() throws Exception {
		if (delid != null) {
			int i = new TbRoleService().deleteByExample(delid);
			System.out.println(i);
		}
		return "listAgain";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Integer> getDelid() {
		return delid;
	}

	public void setDelid(List<Integer> delid) {
		this.delid = delid;
	}

	public List<TbRole> getList() {
		return list;
	}

	public void setList(List<TbRole> list) {
		this.list = list;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
