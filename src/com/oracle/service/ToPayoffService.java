package com.oracle.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.ToPayoffMapper;
import com.oracle.po.Salary;
import com.oracle.po.TbEmp;
import com.oracle.po.ToPayoff;
import com.oracle.po.ToPayoffExample;
import com.oracle.po.ToPayoffExample.Criteria;
import com.oracle.util.DBUtil;

public class ToPayoffService {
	public List<Salary> selectSalary() throws Exception {
		List<Salary> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		ToPayoffMapper toPayoffMapper = sqlSession.getMapper(ToPayoffMapper.class);
		list = toPayoffMapper.selectSalarys();
		for (Salary salary : list) {
			if (salary.getZhuangtai() != null && salary.getZhuangtai() == 1) {
				TbEmp pay = new TbEmpService().selectByPrimaryKey(salary.getPayid());
				salary.setPayname(pay.getEmpname());
			}
		}
		return list;
	}

	public int addSalary(ToPayoff payoff) {
		SqlSession sqlSession = DBUtil.getSession();
		ToPayoffMapper toPayoffMapper = sqlSession.getMapper(ToPayoffMapper.class);
		int i = toPayoffMapper.insert(payoff);
		sqlSession.commit();
		return i;
	}

	public int change(Salary salary) {
		SqlSession sqlSession = DBUtil.getSession();
		ToPayoffMapper toPayoffMapper = sqlSession.getMapper(ToPayoffMapper.class);
		int i = toPayoffMapper.updatePay(salary);
		sqlSession.commit();
		return i;
	}

	public ToPayoff find(Salary salary) {
		SqlSession sqlSession = DBUtil.getSession();
		ToPayoffMapper toPayoffMapper = sqlSession.getMapper(ToPayoffMapper.class);
		ToPayoffExample toPayoffExample = new ToPayoffExample();
		Criteria criteria = toPayoffExample.createCriteria();
		criteria.andEmpidEqualTo(salary.getEmpid());
		criteria.andYearEqualTo(salary.getYear());
		criteria.andMonthEqualTo(salary.getMonth());
		List<ToPayoff> list = toPayoffMapper.selectByExample(toPayoffExample);
		return list.get(0);
	}
}
