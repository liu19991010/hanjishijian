package com.han.dao;

import java.util.List;

import com.han.entity.Donamic_comment;

public interface Donamic_commentDao {
	/*
	 * 根据id查询所有评论信息
	 */
	public List<Donamic_comment> findAllDonamic_comment(int donamic_id);
	/*
	 * 添加评论
	 */
	public int insertConamic_comment(Donamic_comment donamic_comment) ;

}
