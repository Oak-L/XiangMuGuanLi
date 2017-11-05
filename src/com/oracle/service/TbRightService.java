package com.oracle.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.TbRightMapper;
import com.oracle.po.ParentTbRight;
import com.oracle.po.TbRight;
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

	public static void main(String[] args) throws Exception {
		List<ParentTbRight> tbRights = new TbRightService().selectByExample(1);
		for (ParentTbRight pRight : tbRights) {
			System.out.println(pRight.getRightname());
			for (TbRight tbRight : pRight.getChildTbRights()) {
				System.out.println("---" + tbRight.getRightname());
			}
		}
	}
}