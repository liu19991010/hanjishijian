package com.han.dao;

import java.util.List;

import com.han.entity.User;



public interface LoginDao {
	/*
	 * 获取所有用户信息
	 */
	public List<User> findAllUser();
	/*
	 * 判断用户是否存在
	 */
	public int userExist(String username,String password);
	
}
