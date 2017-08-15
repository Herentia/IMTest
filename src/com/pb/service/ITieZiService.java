package com.pb.service;

import java.util.List;

import com.pb.entity.Invitation;

public interface ITieZiService {
	
	/**
	 * 不带条件查询
	 */
	public List<Invitation> getListAll(int currentPage, int pageSize);
	
	/**
	 * 带条件查询
	 */
	public List<Invitation> getList(int currentPage, int pageSize, String title);
	
	/**
	 * 总数据数
	 */
	public long getTotalRowAll();
	
	/**
	 * 带条件数据总数
	 */
	public long getTotalRow(String title);
	
	/**
	 * 删除帖子
	 */
	public int deletetiezi(Invitation invitation);
	
	/**
	 * 通过ID获得一个对象
	 */
	public Invitation gettiezi(Long id);
	
	/**
	 * 修改
	 */
	public int edittiezi(Invitation invitation);

}
