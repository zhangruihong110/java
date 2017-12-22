package com.mybatis.onetomany.entity;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.test1.Test.TestUser;

public class Utils {
	private static SqlSessionFactory sessionFactory;
	
	static{
		sessionFactory=new SqlSessionFactoryBuilder().build(TestUser.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml"));
	}
	
	public static SqlSession getSqlSession(boolean flag){
		return sessionFactory.openSession(flag);
	} 
}
