package com.oracle.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.TbEmpMapper;
import com.oracle.po.TbEmp;
import com.oracle.po.TbEmpExample;
import com.oracle.po.TbEmpExample.Criteria;
import com.oracle.util.DBUtil;

public class TbEmpService {
	public List<TbEmp> selectByExample(String username, String password) throws Exception {
		List<TbEmp> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbEmpMapper tbEmpMapper = sqlSession.getMapper(TbEmpMapper.class);
		TbEmpExample tbEmpExample = new TbEmpExample();
		Criteria criteria = tbEmpExample.createCriteria();
		criteria.andEmpnoEqualTo(username);
		criteria.andPasswordEqualTo(password);
		list = tbEmpMapper.selectByExample(tbEmpExample);
		return list;
	}

	public static void main(String[] args) throws Exception {
		List<TbEmp> list = new TbEmpService().selectByExample("00001", "admin");
		System.out.println(list);
	}
}
