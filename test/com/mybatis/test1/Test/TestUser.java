package com.mybatis.test1.Test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.onetomany.entity.Classes;
import com.mybatis.onetomany.entity.Utils;

public class TestUser {
	@Test
	public void tt(){
		SqlSession session = Utils.getSqlSession(false);
		Classes classes=session.selectOne("com.mybatis.onetomany.entity.classMapper.getClass", 1);
		System.err.println("classes======"+classes.getName());
		System.err.println("teacher======"+classes.getTeacher().getName());
		System.err.println("student======"+classes.getStudents().toString());
	}
	
	/*@Test
	public void tt2(){
		SqlSession session = Utils.getSqlSession(false);
		Classes classes=session.selectOne("com.mybatis.onetoone.entity.classMapper.getClass2", 1);
		System.err.println("classes======"+classes.getName());
		System.err.println("teacher======"+classes.getTeacher().getName());
	}*/
	
}
