package com.han.dao;

import java.util.List;

import com.han.entity.Donamic_reply;

public interface Donamic_replyDao {
	/*
	 * �������۲�ѯ���лظ�
	 */
	public List<Donamic_reply> findAllDonamic_reply(int comment_id);
	/*
	 * ��ӻظ�
	 */
	public int insertDonamic_reply(Donamic_reply donamic_reply) ;
		
	

}
