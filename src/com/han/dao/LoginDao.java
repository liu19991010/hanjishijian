package com.han.dao;

import java.util.List;

import com.han.entity.User;



public interface LoginDao {
	/*
	 * ��ȡ�����û���Ϣ
	 */
	public List<User> findAllUser();
	/*
	 * �ж��û��Ƿ����
	 */
	public int userExist(String username,String password);
	
}
