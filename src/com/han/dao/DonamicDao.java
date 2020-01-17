package com.han.dao;

import java.util.List;

import com.han.entity.Donamic;

public interface DonamicDao {
	/*
	 * 查询所有动态信息
	 */
	public List<Donamic> findAllDonamic();
	/*
	 * 添加动态
	 */
	public int insert(Donamic donamic);

}
