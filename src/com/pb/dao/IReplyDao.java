package com.pb.dao;

import java.util.List;

import com.pb.entity.ReplyDetail;

public interface IReplyDao {
	
	/**
	 * �ظ�ҳ��
	 */
	public List<ReplyDetail> getList(int currentPage, int pageSize, int invId);
	
	/**
	 * ��ӻظ�
	 */
	public int addReply(ReplyDetail replyDetail);

}
