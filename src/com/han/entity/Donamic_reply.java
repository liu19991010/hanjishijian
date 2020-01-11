package com.han.entity;

public class Donamic_reply {
	private int connect_id;
	private String comment_username;
	private int reply_id;
	private String connect;
	private String time;
	private String reply_username;
	public Donamic_reply() {
		super();
	}
	public int getConnect_id() {
		return connect_id;
	}
	public void setConnect_id(int connect_id) {
		this.connect_id = connect_id;
	}
	public String getComment_username() {
		return comment_username;
	}
	public void setComment_username(String comment_username) {
		this.comment_username = comment_username;
	}
	public int getReply_id() {
		return reply_id;
	}
	public void setReply_id(int reply_id) {
		this.reply_id = reply_id;
	}
	public String getConnect() {
		return connect;
	}
	public void setConnect(String connect) {
		this.connect = connect;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getReply_username() {
		return reply_username;
	}
	public void setReply_username(String reply_username) {
		this.reply_username = reply_username;
	}
	public Donamic_reply(int connect_id,String comment_username,int reply_id,String connect,String time,String reply_username) {
		super();
		this.connect_id = connect_id;
		this.comment_username = comment_username;
		this.reply_id =reply_id;
		this.connect = connect;
		this.time = time;
		this.reply_username = reply_username;
	}
	

}
