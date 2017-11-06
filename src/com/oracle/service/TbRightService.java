package com.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.TbRightMapper;
import com.oracle.po.ParentTbRight;
import com.oracle.po.TbRight;
import com.oracle.po.TbRightExample;
import com.oracle.po.TbRole;
import com.oracle.util.DBUtil;

public class TbRightService {
	public List<ParentTbRight> selectByExample(int empid) throws Exception {
		List<ParentTbRight> tbRights = null;
		List<ParentTbRight> pRights = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbRightMapper tbRightMapper = sqlSession.getMapper(TbRightMapper.class);
		tbRights = tbRightMapper.getTbrightByTbemp(empid);
		if (tbRights != null) {
			pRights = new ArrayList<>();
		}
		for (TbRight tbRight : tbRights) {
			if (tbRight.getCode().length() == 3) {
				pRights.add((ParentTbRight) tbRight);
			}
		}
		for (TbRight tbRight : tbRights) {
			if (tbRight.getCode().length() != 3) {
				for (ParentTbRight p : pRights) {
					if (tbRight.getCode().contains(p.getCode())) {
						p.getChildTbRights().add(tbRight);
					}
				}
			}
		}
		return pRights;
	}

	public List<TbRight> selectAll() throws Exception {
		List<TbRight> list = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbRightMapper tbRightMapper = sqlSession.getMapper(TbRightMapper.class);
		TbRightExample tbRightExample = new TbRightExample();
		list = tbRightMapper.selectByExample(tbRightExample);
		return list;
	}

	public List<TbRight> selectByTorightrole(int roleid) throws Exception {
		List<TbRight> mylist = null;
		SqlSession sqlSession = DBUtil.getSession();
		TbRightMapper tbRightMapper = sqlSession.getMapper(TbRightMapper.class);
		mylist = tbRightMapper.getTbrightByTorightrole(roleid);
		return mylist;
	}
	
	public void update(List<Integer> delid,TbRole role) {
//		SqlSession sqlSession = DBUtil.getSession();
//		TbRightMapper tbRightMapper = sqlSession.getMapper(TbRightMapper.class);
//		int i = tbRightMapper.deleteByPrimaryKey(rightid)(roleid);
	}

	public static void main(String[] args) throws Exception {
		System.out.println(new TbRightService().selectByTorightrole(1));
	}
}