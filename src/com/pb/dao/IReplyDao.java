package com.pb.dao;

import java.util.List;

import com.pb.entity.ReplyDetail;

public interface IReplyDao {
	
	/**
	 * 回复页面
	 */
	public List<ReplyDetail> getList(int currentPage, int pageSize, int invId);
	
	/**
	 * 添加回复
	 */
	public int addReply(ReplyDetail replyDetail);

}
