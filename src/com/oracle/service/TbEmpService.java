package com.oracle.service;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.oracle.mapper.TbEmpMapper;
import com.oracle.po.TbEmp;
import com.oracle.po.TbEmpExample;
import com.oracle.po.TbEmpExample.Criteria;

public class TbEmpService {
	public List<TbEmp> selectByExample(String username, String password) throws Exception {
		List<TbEmp> list = null;
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
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
