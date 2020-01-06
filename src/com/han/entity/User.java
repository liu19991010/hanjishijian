package com.han.entity;

public class User {
	String username;
	int password;
	String head;
	int sex;
	String email;
	int age;
	public User(){
		super();
	}
	public User(String username,int password,String head,int sex,String email,int age) {
		this.username = username;
		this.password = password;
		this.head = head;
		this.sex = sex;
		this.email = email;
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
