package com.oracle.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtil {
	static String resource = null;
	static SqlSessionFactory sqlSessionFactory = null;
	// 静态代码块实现
	static {
		resource = "mybatis-config.xml";
		try {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 提供返回与本地线程绑定的session方法
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}

	// 提供方法返回sessionFactory
	public static SqlSessionFactory getSessionFactory() {
		return sqlSessionFactory;
	}

	public static void main(String[] args) {

	}
}
