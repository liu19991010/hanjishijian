package com.han.dao;

import java.util.List;

import com.han.entity.Invitation;

public interface InvitationDao {
	/*
	 * 查询所有帖子信息
	 */
	public List<Invitation> findAllInvitation();
	/*
	 * 更具作者，用户，书名查询帖子信息
	 */
	List<Invitation> findInvitationAUB(String user);
	/*
	 * 根据作者查询帖子信息
	 */
	public List<Invitation> findInvitationByAuthor(String author);
	/*
	 * 根据用户查询帖子信息
	 */
	public List<Invitation> findInvitationByUsername(String username);
	/*
	 * 根据用户查询帖子信息
	 */
	public List<Invitation> findInvitationByBookname(String bookname);
	/*
	 * 添加帖子
	 */
	public int Insertinvitation(Invitation invitation);
	/*
	 * 查询所有作者
	 */
	public List<String> findAuthor();
	/*
	 * 查询所有书名
	 */
	public List<String> findBookname();
	

}
