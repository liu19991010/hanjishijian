package com.han.dao;

import java.util.List;

import com.han.entity.Donamic;

public interface DonamicDao {
	/*
	 * ��ѯ���ж�̬��Ϣ
	 */
	public List<Donamic> findAllDonamic();
	/*
	 * ��Ӷ�̬
	 */
	public int insert(Donamic donamic);

}
