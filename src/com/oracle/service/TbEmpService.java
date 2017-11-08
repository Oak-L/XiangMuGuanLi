package com.oracle.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.TbEmpMapper;
import com.oracle.po.TbEmpExample;
import com.oracle.po.TbEmp;
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

	public List<TbEmp> selectAll() throws Exception {
		List<TbEmp> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbEmpMapper tbEmpMapper = sqlSession.getMapper(TbEmpMapper.class);
		TbEmpExample tbEmpExample = new TbEmpExample();
		list = tbEmpMapper.selectByExample(tbEmpExample);
		return list;
	}

	public TbEmp selectByPrimaryKey(int id) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbEmpMapper tbEmpMapper = sqlSession.getMapper(TbEmpMapper.class);
		TbEmp tbEmp = tbEmpMapper.selectByPrimaryKey(id);
		return tbEmp;
	}

	public int updateByPrimaryKey(TbEmp record) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbEmpMapper tbEmpMapper = sqlSession.getMapper(TbEmpMapper.class);
		int i = tbEmpMapper.updateByPrimaryKey(record);
		sqlSession.commit();
		return i;
	}

	public int add(TbEmp tbEmp) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbEmpMapper tbEmpMapper = sqlSession.getMapper(TbEmpMapper.class);
		int i = tbEmpMapper.insert(tbEmp);
		sqlSession.commit();
		return i;
	}

	public int deleteByExample(List<Integer> values) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbEmpMapper tbEmpMapper = sqlSession.getMapper(TbEmpMapper.class);
		TbEmpExample tbEmpExample = new TbEmpExample();
		tbEmpExample.createCriteria().andEmpidIn(values);
		int i = tbEmpMapper.deleteByExample(tbEmpExample);
		sqlSession.commit();
		return i;
	}

	public static void main(String[] args) throws Exception {
		List<TbEmp> list = new TbEmpService().selectByExample("00001", "admin");
		System.out.println(list);
	}
}
