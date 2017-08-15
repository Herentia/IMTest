package com.pb.dao;

import java.util.List;

import com.pb.entity.Invitation;

public interface ITieZiDao {
	
	/**
	 * ����������ѯ
	 */
	public List<Invitation> getListAll(int currentPage, int pageSize);
	
	/**
	 * ��������ѯ
	 */
	public List<Invitation> getList(int currentPage, int pageSize, String title);
	
	/**
	 * �ܼ�¼��
	 */
	public Long getTotalRowAll();
	
	/**
	 * ��������¼��
	 */
	public Long getTotalRow(String title);
	
	/**
	 * ɾ������
	 */
	public int deleteTieZi(Invitation invitation);
	
	/**
	 * �޸�
	 */
	public int editTieZi(Invitation invitation);
	
	/**
	 * ͨ��ID���һ������
	 */
	public Invitation getTieZi(Long id);

}









