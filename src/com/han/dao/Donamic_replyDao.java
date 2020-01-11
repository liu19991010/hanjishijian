package com.han.dao;

import java.util.List;

import com.han.entity.Donamic_reply;

public interface Donamic_replyDao {
	/*
	 * 根据评论查询所有回复
	 */
	public List<Donamic_reply> findAllDonamic_reply(int comment_id);
	/*
	 * 添加回复
	 */
	public int insertDonamic_reply(Donamic_reply donamic_reply) ;
		
	

}
