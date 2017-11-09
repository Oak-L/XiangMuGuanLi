package com.oracle.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oracle.mapper.TbSendmessageMapper;
import com.oracle.po.TbSendmessage;
import com.oracle.po.TbSendmessageExample;
import com.oracle.util.DBUtil;

public class TbMessageService {
	public int send(TbSendmessage tbSendmessage) {
		SqlSession sqlSession = DBUtil.getSession();
		TbSendmessageMapper tbSendmessageMapper = sqlSession.getMapper(TbSendmessageMapper.class);
		int i = tbSendmessageMapper.insert(tbSendmessage);
		sqlSession.commit();
		return i;
	}

	public List<TbSendmessage> listSend(String sendman) {
		SqlSession sqlSession = DBUtil.getSession();
		TbSendmessageMapper tbSendmessageMapper = sqlSession.getMapper(TbSendmessageMapper.class);
		TbSendmessageExample tbSendmessageExample = new TbSendmessageExample();
		tbSendmessageExample.createCriteria().andSendmanEqualTo(sendman);
		List<TbSendmessage> list = tbSendmessageMapper.selectByExample(tbSendmessageExample);
		return list;
	}

	public List<TbSendmessage> listGet(String sid) {
		int id = Integer.valueOf(sid);
		SqlSession sqlSession = DBUtil.getSession();
		TbSendmessageMapper tbSendmessageMapper = sqlSession.getMapper(TbSendmessageMapper.class);
		TbSendmessageExample tbSendmessageExample = new TbSendmessageExample();
		tbSendmessageExample.createCriteria().andEmpidEqualTo(id);
		List<TbSendmessage> list = tbSendmessageMapper.selectByExample(tbSendmessageExample);
		return list;
	}

	public List<TbSendmessage> listAll() {
		SqlSession sqlSession = DBUtil.getSession();
		TbSendmessageMapper tbSendmessageMapper = sqlSession.getMapper(TbSendmessageMapper.class);
		TbSendmessageExample tbSendmessageExample = new TbSendmessageExample();
		List<TbSendmessage> list = tbSendmessageMapper.selectByExample(tbSendmessageExample);
		return list;
	}

	public TbSendmessage find(int sendid) {
		SqlSession sqlSession = DBUtil.getSession();
		TbSendmessageMapper tbSendmessageMapper = sqlSession.getMapper(TbSendmessageMapper.class);
		TbSendmessage tbSendmessage = tbSendmessageMapper.selectByPrimaryKey(sendid);
		return tbSendmessage;
	}

	public int deleteByExample(List<Integer> values) throws Exception {
		SqlSession sqlSession = DBUtil.getSession();
		TbSendmessageMapper tbSendmessageMapper = sqlSession.getMapper(TbSendmessageMapper.class);
		TbSendmessageExample tbSendmessageExample = new TbSendmessageExample();
		tbSendmessageExample.createCriteria().andSendidIn(values);
		int i = tbSendmessageMapper.deleteByExample(tbSendmessageExample);
		sqlSession.commit();
		return i;
	}
}
