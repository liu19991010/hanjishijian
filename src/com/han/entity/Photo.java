package com.han.entity;

public class Photo {
	private int donamic_id;
	private int photo_id;
	private String photo;
	public Photo() {
		super();
	}
	public Photo(int donamic_id,int photo_id,String photo) {
		this.donamic_id = donamic_id;
		this.photo_id = photo_id;
		this.photo = photo;
				
		
	}
	public int getDonamic_id() {
		return donamic_id;
	}
	public void setDonamic_id(int donamic_id) {
		this.donamic_id = donamic_id;
	}
	public int getPhoto_id() {
		return photo_id;
	}
	public void setPhoto_id(int photo_id) {
		this.photo_id = photo_id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
