package com.pb.service;

import java.util.List;

import com.pb.entity.Invitation;

public interface ITieZiService {
	
	/**
	 * ����������ѯ
	 */
	public List<Invitation> getListAll(int currentPage, int pageSize);
	
	/**
	 * ��������ѯ
	 */
	public List<Invitation> getList(int currentPage, int pageSize, String title);
	
	/**
	 * ��������
	 */
	public long getTotalRowAll();
	
	/**
	 * ��������������
	 */
	public long getTotalRow(String title);
	
	/**
	 * ɾ������
	 */
	public int deletetiezi(Invitation invitation);
	
	/**
	 * ͨ��ID���һ������
	 */
	public Invitation gettiezi(Long id);
	
	/**
	 * �޸�
	 */
	public int edittiezi(Invitation invitation);

}
