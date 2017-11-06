package com.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.ToRightroleMapper;
import com.oracle.po.TbRole;
import com.oracle.po.ToRightrole;
import com.oracle.po.ToRightroleExample;
import com.oracle.util.DBUtil;

public class ToRightroleService {
	public void update(List<Integer> delid, TbRole role) {
		SqlSession sqlSession = DBUtil.getSession();
		ToRightroleMapper toRightroleMapper = sqlSession.getMapper(ToRightroleMapper.class);
		ToRightroleExample toRightroleExample = new ToRightroleExample();
		toRightroleExample.createCriteria().andRoleidEqualTo(role.getRoleid());
		int i = toRightroleMapper.deleteByExample(toRightroleExample);
		System.out.println(i);
		toRightroleExample = new ToRightroleExample();
		toRightroleExample.createCriteria().andRoleidEqualTo(role.getRoleid());
		int count = 0;
		for (Integer id : delid) {
			ToRightrole toRightrole = new ToRightrole();
			toRightrole.setRoleid(role.getRoleid());
			toRightrole.setRightid(id.toString());
			count = count + toRightroleMapper.insert(toRightrole);
		}
		System.out.println(count);
		sqlSession.commit();

	}

	public static void main(String[] args) throws Exception {
		TbRole tbRole = new TbRole();
		tbRole.setRoleid(2);
		List<Integer> delid = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			delid.add(i);
		}
		new ToRightroleService().update(delid, tbRole);
	}
}