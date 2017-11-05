package com.oracle.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.TbRoleMapper;
import com.oracle.po.TbRole;
import com.oracle.po.TbRoleExample;
import com.oracle.util.DBUtil;

public class TbRoleService {
	public List<TbRole> selectAll() throws Exception {
		List<TbRole> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbRoleMapper tbRoleMapper = sqlSession.getMapper(TbRoleMapper.class);
		TbRoleExample tbRoleExample = new TbRoleExample();
		list = tbRoleMapper.selectByExample(tbRoleExample);
		return list;
	}

	public List<TbRole> selectFind(String value) throws Exception {
		List<TbRole> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbRoleMapper tbRoleMapper = sqlSession.getMapper(TbRoleMapper.class);
		TbRoleExample tbRoleExample = new TbRoleExample();
		tbRoleExample.createCriteria().andRolenameLike("%" + value + "%");
		list = tbRoleMapper.selectByExample(tbRoleExample);
		return list;
	}

	public int add(TbRole tbRole) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbRoleMapper TbRoleMapper = sqlSession.getMapper(TbRoleMapper.class);
		int i = TbRoleMapper.insert(tbRole);
		sqlSession.commit();
		return i;
	}

	public TbRole selectByPrimaryKey(int id) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbRoleMapper TbRoleMapper = sqlSession.getMapper(TbRoleMapper.class);
		TbRole tbRole = TbRoleMapper.selectByPrimaryKey(id);
		return tbRole;
	}

	public int updateByPrimaryKey(TbRole record) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbRoleMapper TbRoleMapper = sqlSession.getMapper(TbRoleMapper.class);
		int i = TbRoleMapper.updateByPrimaryKey(record);
		sqlSession.commit();
		return i;
	}

	public int deleteByExample(List<Integer> values) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbRoleMapper TbRoleMapper = sqlSession.getMapper(TbRoleMapper.class);
		TbRoleExample tbRoleExample = new TbRoleExample();
		tbRoleExample.createCriteria().andRoleidIn(values);
		int i = TbRoleMapper.deleteByExample(tbRoleExample);
		sqlSession.commit();
		return i;
	}

	public static void main(String[] args) throws Exception {
		// List<Integer> values = new ArrayList<>();
		// values.add(11);
		// values.add(12);
		// int i = new TbRoleService().deleteByExample(values);
		// System.out.println(i);
	}
}
