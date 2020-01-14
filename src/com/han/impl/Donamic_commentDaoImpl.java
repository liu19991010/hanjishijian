package com.han.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.han.dao.Donamic_commentDao;
import com.han.entity.Donamic_comment;
import com.han.utils.DBUtile;

public class Donamic_commentDaoImpl extends DBUtile implements Donamic_commentDao{
	Connection conn;
	 PreparedStatement ps;
	 ResultSet rs;
	/*
	 * 根据id查询所有评论信息
	 */

	@Override
	public List<Donamic_comment> findAllDonamic_comment(int donamic_id) {
		List<Donamic_comment> list = new ArrayList<Donamic_comment>();
		conn = super.getConnection();
		String sql = "select * from donamic_comment where donamic_id =?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, donamic_id);
	        
			rs = ps.executeQuery();
			while(rs.next()) {
				Donamic_comment donamic_comment = new Donamic_comment();
				donamic_comment.setUsername(rs.getString(1));
				donamic_comment.setDonamic_id(rs.getInt(2));
				donamic_comment.setComment_id(rs.getInt(3));
				donamic_comment.setConnect(rs.getString(4));
				donamic_comment.setTime(rs.getString(5));
				list.add(donamic_comment);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	/*
	 * 添加评论
	 */

	@Override
	public int insertConamic_comment(Donamic_comment donamic_comment) {
		int temp = 0;
		conn = super.getConnection();
		String sql = "insert into donamic_comment(username,donamic_id,comment_id,connect,time) value(?,?,null,?,?) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, donamic_comment.getUsername());
			ps.setInt(2, donamic_comment.getDonamic_id());
			ps.setString(3, donamic_comment.getConnect());
			ps.setString(4, donamic_comment.getTime());
			
			temp = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.closeALL(conn, ps, rs);
		}
		
		return temp;
	}

}
