package com.han.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.han.dao.DonamicDao;
import com.han.entity.Donamic;
import com.han.entity.Invitation;
import com.han.utils.DBUtile;

public class DonamicDaoImpl extends DBUtile implements DonamicDao{
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;

	/*
	 * 查询所有动态信息
	 */
	@Override
	public List<Donamic> findAllDonamic() {
		List<Donamic> list = new ArrayList<Donamic>();
		conn = super.getConnection();
		String sql = "select *from donamic order by donamicID desc";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Donamic donamic = new Donamic();
				donamic.setUsername(rs.getString(1));
				donamic.setDonamic_id(rs.getInt(2));
				donamic.setConnect(rs.getString(3));
				donamic.setTime(rs.getString(4));
				list.add(donamic);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/*
	 * 添加动态
	 */
	@Override
	public int insert(Donamic donamic) {
		int temp = 0;
		conn = super.getConnection();
		String sql = "insert into donamic(username,donamicID,connect,time) value(?,null,?,?) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, donamic.getUsername());
			ps.setString(2, donamic.getConnect());
			ps.setString(3, donamic.getTime());
			temp = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.closeALL(conn, ps, rs);
		}
		
		return temp;
	}

}
