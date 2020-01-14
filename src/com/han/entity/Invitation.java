package com.han.entity;

public class Invitation {
	private String username;
	private int id;
	private String author;
	private String bookname;
	private String connect;
	private int sum;
	public Invitation() {
		super();
	}
	public Invitation(String username,int id,String author,String bookname, String connect,int sum) {
		this.username = username;
		this.id = id;
		this.author = author;
		this.bookname = bookname;
		this.connect = connect;
		this.sum = sum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getConnect() {
		return connect;
	}
	public void setConnect(String connect) {
		this.connect = connect;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	

}
