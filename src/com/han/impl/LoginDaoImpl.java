package com.han.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.han.dao.LoginDao;
import com.han.entity.User;
import com.han.utils.DBUtile;



public class LoginDaoImpl extends DBUtile implements LoginDao {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	@Override
	public List<User> findAllUser() {
//		List<User> list = new ArrayList<User>();
//		conn = super.getConnection();
//		String sql = "select * from user";
//		try {
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
//			while(rs.next()) {
//				User info = new User();
//				info.setUsername(rs.getString(1));
//				info.setPassword(rs.getString(2));
//				info.setEmail(rs.getString(3));
//				info.setAge(rs.getInt(4));
//				info.setSex(rs.getInt(5));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			super.closeALL(conn, ps, rs);
//		}
//		
		return null;
	}
	@Override
	public int userExist(String username, String password) {
		int temp = 0;
		conn = super.getConnection();
		String sql = "select * from user where username=? and password=?";
		try {
			ps = conn.prepareStatement(sql);
			 ps.setString(1, username);
	            ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) temp = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.closeALL(conn, ps, rs);
		}
		
		return temp;
	}
	

}
