package com.mybatis.onetomany.entity;

import java.util.Set;

public class Classes {
	private int id; // id===>c_id
	private String name; // name===>c_name
	private Teacher teacher;
	private Set<Student> students;
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Classes() {
		super();
	}
	public Classes(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + "]";
	}
	public Classes(String name) {
		super();
		this.name = name;
	}
	
}
