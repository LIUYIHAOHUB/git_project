package com.nnxy.model;

public class Student {
	private String id;//唯一的ID
	private String username;//用户名
	private String password;//密码
	private int age;//年龄
	private int sex;//性别
	public Student(String id, String username, String password, int age, int sex) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + ", sex="
				+ sex + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
}
