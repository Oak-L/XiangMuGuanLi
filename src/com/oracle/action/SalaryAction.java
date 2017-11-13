package com.oracle.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.po.Salary;
import com.oracle.po.TbEmp;
import com.oracle.po.ToPayoff;
import com.oracle.service.TbEmpService;
import com.oracle.service.ToPayoffService;

public class SalaryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Salary> list;
	private Salary salary;
	private ToPayoff payoff;
	private TbEmp emp;

	public String standards() {
		return "standards";
	}

	public String give() throws Exception {
		emp = new TbEmpService().selectByPrimaryKey(emp.getEmpid());
		return "give";
	}

	public String add() {
		payoff.setComm(payoff.getSal() + emp.getSubsidy() - payoff.getDeductsum());
		System.out.println(new ToPayoffService().addSalary(payoff));
		return "listAgain";
	}

	public String listSalary() throws Exception {
		list = new ToPayoffService().selectSalary();
		return "list";
	}

	public String findSalary() throws Exception {
		payoff = new ToPayoffService().find(salary);
		return "find";
	}

	public String change() throws Exception {
		int i = new ToPayoffService().change(salary);
		System.out.println(i);
		return "listAgain";
	}

	public List<Salary> getList() {
		return list;
	}

	public void setList(List<Salary> list) {
		this.list = list;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public TbEmp getEmp() {
		return emp;
	}

	public void setEmp(TbEmp emp) {
		this.emp = emp;
	}

	public ToPayoff getPayoff() {
		return payoff;
	}

	public void setPayoff(ToPayoff payoff) {
		this.payoff = payoff;
	}

}
