package com.oracle.service;

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

	public static void main(String[] args) throws Exception {
		TbCompany list = new TbCompanyService().selectByPrimaryKey(9);
		System.out.println(list);
	}
}
