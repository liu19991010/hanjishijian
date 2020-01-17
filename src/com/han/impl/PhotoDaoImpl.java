package com.han.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.han.dao.PhotoDao;
import com.han.entity.Invitation;
import com.han.entity.Photo;
import com.han.utils.DBUtile;

public class PhotoDaoImpl extends DBUtile implements PhotoDao{
	Connection conn;
 PreparedStatement ps;
 ResultSet rs;
	/*
	 * 根据id查询图片数量
	 */

	@Override
	public int findPhotoSum(int donamic_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * 根据id查询所有图片信息
	 */

	@Override
	public List<Photo> findAllPhoto(int donamic_id) {
		List<Photo> list = new ArrayList<Photo>();
		conn = super.getConnection();
		String sql = "select * from photo where donamic_id =?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, donamic_id);
	        
			rs = ps.executeQuery();
			while(rs.next()) {
				Photo photo = new Photo();
				photo.setDonamic_id(rs.getInt(1));
				photo.setPhoto_id(rs.getInt(2));
				photo.setPhoto(rs.getString(3));
				list.add(photo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * 添加图片
	 * @see com.han.dao.PhotoDao#insertPhoto(com.han.entity.Photo)
	 */
	@Override
	public int insertPhoto(Photo photo) {
		int temp = 0;
		conn = super.getConnection();
		String sql = "insert into photo(donamic_id,photo_id,photo) value(?,null,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, photo.getDonamic_id());
			ps.setString(2, photo.getPhoto());
			temp = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			super.closeALL(conn, ps, rs);
		}
		
		return temp;
		
	}

	

}
