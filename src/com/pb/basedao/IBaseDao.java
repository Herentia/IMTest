package com.pb.basedao;

import java.util.List;

public interface IBaseDao<T> {
	
	/**
	 * ����������ҳ
	 */
	public List<T> getListAll(int currentPage, int pageSize, String hql);
	
	/**
	 * ��������ҳ
	 */
	public List<T> getList(int currentPage, int pageSize, String hql, Object[] objs);
	
	/**
	 * ��ȡ�ܼ�¼����
	 */
	public Long getTotalRowAll(String hql);
	
	/**
	 * ��ȡ�������ܼ�¼��
	 */
	public Long getTotalRow(String hql, Object[] objs);
	
	/**
	 * ͨ�����Ӷ���ɾ������
	 */
	public int deleteTieZi(T t);
	
	/**
	 * ���
	 */
	public int add(T t);
	
	/**
	 * �޸�
	 */
	public int edit(T t);
	
	

}











