package com.han.dao;

import java.util.List;

import com.han.entity.Photo;

public interface PhotoDao {
	/*
	 * ����id��ѯͼƬ����
	 */
	public int findPhotoSum(int donamic_id);
	/*
	 * ��ѯ����ͼƬ��Ϣ
	 */
	public List<Photo> findAllPhoto(int donamic_id);
	/*
	 * ���ͼƬ
	 */
	public int insertPhoto(Photo photo);

}
