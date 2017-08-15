package com.pb.service;

import java.util.List;

import com.pb.entity.ReplyDetail;

public interface IReplyService {
	
	/**
	 * 获取帖子回复的数据
	 */
	public List<ReplyDetail> getList(int currentPage, int pageSize, int invId);
	
	/**
	 * 添加回复
	 */
	public int addReply(ReplyDetail replyDetail);

}
