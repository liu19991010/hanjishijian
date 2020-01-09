package com.han.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.han.dao.InvitationDao;
import com.han.entity.Invitation;
import com.han.utils.DBUtile;

public class InvitationDaoImpl extends DBUtile implements InvitationDao{
 
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	/*
	 * 查询所有帖子信息
	 */
	@Override
	public List<Invitation> findAllInvitation() {
		List<Invitation> list = new ArrayList<Invitation>();
		conn = super.getConnection();
		String sql = "select * from invitation order by id desc";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Invitation invitation = new Invitation();
				invitation.setUsername(rs.getString(1));
				invitation.setId(rs.getInt(2));
				invitation.setAuthor(rs.getString(3));
				invitation.setBookname(rs.getString(4));
				invitation.setConnect(rs.getString(5));
				invitation.setSum(rs.getInt(6));
				list.add(invitation);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	/*
	 * 更具作者，用户，书名查询帖子信息
	 */

	@Override
	public List<Invitation> findInvitationAUB(String user) {
		List<Invitation> list = new ArrayList<Invitation>();
		conn = super.getConnection();
		String sql = "select * from invitation where username=? or author=? or bookname =? order by id desc";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user);
	        ps.setString(2, user);
	        ps.setString(3, user);
			rs = ps.executeQuery();
			while(rs.next()) {
				Invitation invitation = new Invitation();
				invitation.setUsername(rs.getString(1));
				invitation.setId(rs.getInt(2));
				invitation.setAuthor(rs.getString(3));
				invitation.setBookname(rs.getString(4));
				invitation.setConnect(rs.getString(5));
				invitation.setSum(rs.getInt(6));
				list.add(invitation);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	/*
	 * 根据作者查询帖子信息
	 */
	@Override
	public List<Invitation> findInvitationByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 根据用户查询帖子信息
	 */
	@Override
	public List<Invitation> findInvitationByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 根据用户查询帖子信息
	 */
	@Override
	public List<Invitation> findInvitationByBookname(String bookname) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 添加帖子
	 */
	@Override
	public int Insertinvitation(Invitation invitation) {
		int temp = 0;
		conn = super.getConnection();
		String sql = "insert into invitation(username,id,author,bookname,connect,sum) value(?,null,?,?,?,?) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, invitation.getUsername());
			ps.setString(2, invitation.getAuthor());
			ps.setString(3, invitation.getBookname());
			ps.setString(4, invitation.getConnect());
			ps.setInt(5, invitation.getSum());
			temp = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.closeALL(conn, ps, rs);
		}
		
		return temp;
	}
	/*
	 * 查询所有作者
	 */
	@Override
	public List<String> findAuthor() {
		List<String> list = new ArrayList<String>();
		conn = super.getConnection();
		String sql = "select distinct author from invitation ";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	/*
	 * 查询所有书名
	 */
	@Override
	public List<String> findBookname() {
		List<String> list = new ArrayList<String>();
		conn = super.getConnection();
		String sql = "select distinct bookname from invitation ";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	

}
