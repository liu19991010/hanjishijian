package com.han.dao;

import java.util.List;

import com.han.entity.Invitation;

public interface InvitationDao {
	/*
	 * ��ѯ����������Ϣ
	 */
	public List<Invitation> findAllInvitation();
	/*
	 * �������ߣ��û���������ѯ������Ϣ
	 */
	List<Invitation> findInvitationAUB(String user);
	/*
	 * �������߲�ѯ������Ϣ
	 */
	public List<Invitation> findInvitationByAuthor(String author);
	/*
	 * �����û���ѯ������Ϣ
	 */
	public List<Invitation> findInvitationByUsername(String username);
	/*
	 * �����û���ѯ������Ϣ
	 */
	public List<Invitation> findInvitationByBookname(String bookname);
	/*
	 * �������
	 */
	public int Insertinvitation(Invitation invitation);
	/*
	 * ��ѯ��������
	 */
	public List<String> findAuthor();
	/*
	 * ��ѯ��������
	 */
	public List<String> findBookname();
	

}
