package com.han.dao;

import java.util.List;

import com.han.entity.Donamic_comment;

public interface Donamic_commentDao {
	/*
	 * ����id��ѯ����������Ϣ
	 */
	public List<Donamic_comment> findAllDonamic_comment(int donamic_id);
	/*
	 * �������
	 */
	public int insertConamic_comment(Donamic_comment donamic_comment) ;

}
