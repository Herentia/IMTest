package com.pb.basedao;

import java.util.List;

public interface IBaseDao<T> {
	
	/**
	 * 不带条件分页
	 */
	public List<T> getListAll(int currentPage, int pageSize, String hql);
	
	/**
	 * 带条件分页
	 */
	public List<T> getList(int currentPage, int pageSize, String hql, Object[] objs);
	
	/**
	 * 获取总记录条数
	 */
	public Long getTotalRowAll(String hql);
	
	/**
	 * 获取带条件总记录数
	 */
	public Long getTotalRow(String hql, Object[] objs);
	
	/**
	 * 通过帖子对象删除帖子
	 */
	public int deleteTieZi(T t);
	
	/**
	 * 添加
	 */
	public int add(T t);
	
	/**
	 * 修改
	 */
	public int edit(T t);
	
	

}











