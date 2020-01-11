package com.han.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.han.dao.Donamic_replyDao;
import com.han.entity.Donamic_reply;
import com.han.utils.DBUtile;

public class Donamic_replyDaoImpl extends DBUtile implements Donamic_replyDao {
	Connection conn;
	 PreparedStatement ps;
	 ResultSet rs;
	/*
	 * 根据评论查询所有回复
	 */
	@Override
	public List<Donamic_reply> findAllDonamic_reply(int comment_id) {
		List<Donamic_reply> list = new ArrayList<Donamic_reply>();
		conn = super.getConnection();
		String sql = "select * from donamic_comment_reply where connect_id =?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, comment_id);
	        
			rs = ps.executeQuery();
			while(rs.next()) {
				Donamic_reply donamic_reply = new Donamic_reply();
				donamic_reply.setConnect_id(rs.getInt(1));
				donamic_reply.setComment_username(rs.getString(2));
				donamic_reply.setReply_id(rs.getInt(3));
				donamic_reply.setConnect(rs.getString(4));
				donamic_reply.setTime(rs.getString(5));
				donamic_reply.setReply_username(rs.getString(6));
				
//				donamic_comment.setUsername(rs.getString(1));
//				donamic_comment.setDonamic_id(rs.getInt(2));
//				donamic_comment.setComment_id(rs.getInt(3));
//				donamic_comment.setConnect(rs.getString(4));
//				donamic_comment.setTime(rs.getString(5));
//				Donamic_comment do = new Donamic_comment();
//				photo.setDonamic_id(rs.getInt(1));
//				photo.setPhoto_id(rs.getInt(2));
//				photo.setPhoto(rs.getString(3));
				list.add(donamic_reply);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	/*
	 * 添加回复
	 */
	@Override
	public int insertDonamic_reply(Donamic_reply donamic_reply) {
		// TODO Auto-generated method stub
		return 0;
	}

}
