package com.han.dao;

import java.util.List;

import com.han.entity.Photo;

public interface PhotoDao {
	/*
	 * 根据id查询图片数量
	 */
	public int findPhotoSum(int donamic_id);
	/*
	 * 查询所有图片信息
	 */
	public List<Photo> findAllPhoto(int donamic_id);
	/*
	 * 添加图片
	 */
	public int insertPhoto(Photo photo);

}
