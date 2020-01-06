package com.han.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.han.entity.User;




public class DBUtile {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://39.106.44.74:3306/hanjiashijian";
	String name = "root";//数据库用户名
	String pwd="123456";
	Connection conn;

	public Connection getConnection() {
//		java.sql.Connection conn = null;
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =   DriverManager.getConnection(url,name,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	public void closeALL(Connection conn,PreparedStatement ps,ResultSet rs) {
		if(rs !=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps !=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn !=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public List<User> findUserAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
