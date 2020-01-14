package com.han.entity;

public class Donamic {
	private String username;
	private int donamic_id;
	private String connect;
	private String time;
	public Donamic() {
		super();
	}
	public Donamic(String username,int donamic_id,String connect,String time) {
		super();
		this.username = username;
		this.donamic_id = donamic_id;
		this.connect = connect;
		this.time = time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getDonamic_id() {
		return donamic_id;
	}
	public void setDonamic_id(int donamic_id) {
		this.donamic_id = donamic_id;
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
	
	

}
