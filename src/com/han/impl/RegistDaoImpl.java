package com.han.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.han.dao.RegistDao;
import com.han.entity.User;
import com.han.utils.DBUtile;

public class RegistDaoImpl extends DBUtile implements RegistDao {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public int insertUser(User user) {
		int temp = 0;
		conn = super.getConnection();
		String sql = "insert into user(username,password,head,sex,email,age) value(?,?,?,?,?,?) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2,user.getPassword() );
			ps.setString(3, user.getHead());
			ps.setInt(4, user.getSex());
			ps.setString(5,user.getEmail());
			ps.setInt(6,user.getAge());
			temp = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.closeALL(conn, ps, rs);
		}
		
		return temp;
	}
}


