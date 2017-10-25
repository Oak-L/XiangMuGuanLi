package com.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.TbCompanyMapper;
import com.oracle.po.TbCompany;
import com.oracle.po.TbCompanyExample;
import com.oracle.util.DBUtil;

public class TbCompanyService {
	public List<TbCompany> selectAll() throws Exception {
		List<TbCompany> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbCompanyMapper tbCompanyMapper = sqlSession.getMapper(TbCompanyMapper.class);
		TbCompanyExample tbCompanyExample = new TbCompanyExample();
		list = tbCompanyMapper.selectByExample(tbCompanyExample);
		return list;
	}

	public List<TbCompany> selectFind(String value) throws Exception {
		List<TbCompany> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbCompanyMapper tbCompanyMapper = sqlSession.getMapper(TbCompanyMapper.class);
		TbCompanyExample tbCompanyExample = new TbCompanyExample();
		tbCompanyExample.createCriteria().andCompanynameLike("%" + value + "%");
		list = tbCompanyMapper.selectByExample(tbCompanyExample);
		return list;
	}

	public int add(TbCompany tbCompany) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbCompanyMapper tbCompanyMapper = sqlSession.getMapper(TbCompanyMapper.class);
		int i = tbCompanyMapper.insert(tbCompany);
		sqlSession.commit();
		return i;
	}

	public TbCompany selectByPrimaryKey(int id) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbCompanyMapper tbCompanyMapper = sqlSession.getMapper(TbCompanyMapper.class);
		TbCompany tbCompany = tbCompanyMapper.selectByPrimaryKey(id);
		return tbCompany;
	}

	public int updateByPrimaryKey(TbCompany record) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbCompanyMapper tbCompanyMapper = sqlSession.getMapper(TbCompanyMapper.class);
		int i = tbCompanyMapper.updateByPrimaryKey(record);
		sqlSession.commit();
		return i;
	}

	public int deleteByExample(List<Integer> values) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbCompanyMapper tbCompanyMapper = sqlSession.getMapper(TbCompanyMapper.class);
		TbCompanyExample tbCompanyExample = new TbCompanyExample();
		tbCompanyExample.createCriteria().andCompanyidIn(values);
		int i = tbCompanyMapper.deleteByExample(tbCompanyExample);
		sqlSession.commit();
		return i;
	}

	public static void main(String[] args) throws Exception {
		List<Integer> values = new ArrayList<>();
		values.add(11);
		values.add(12);
		int i = new TbCompanyService().deleteByExample(values);
		System.out.println(i);
	}
}
