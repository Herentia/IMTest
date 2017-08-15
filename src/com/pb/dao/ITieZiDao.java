package com.pb.dao;

import java.util.List;

import com.pb.entity.Invitation;

public interface ITieZiDao {
	
	/**
	 * 不带条件查询
	 */
	public List<Invitation> getListAll(int currentPage, int pageSize);
	
	/**
	 * 带条件查询
	 */
	public List<Invitation> getList(int currentPage, int pageSize, String title);
	
	/**
	 * 总记录数
	 */
	public Long getTotalRowAll();
	
	/**
	 * 带条件记录数
	 */
	public Long getTotalRow(String title);
	
	/**
	 * 删除帖子
	 */
	public int deleteTieZi(Invitation invitation);
	
	/**
	 * 修改
	 */
	public int editTieZi(Invitation invitation);
	
	/**
	 * 通过ID获得一个对象
	 */
	public Invitation getTieZi(Long id);

}









