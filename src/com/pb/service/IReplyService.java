package com.pb.service;

import java.util.List;

import com.pb.entity.ReplyDetail;

public interface IReplyService {
	
	/**
	 * ��ȡ���ӻظ�������
	 */
	public List<ReplyDetail> getList(int currentPage, int pageSize, int invId);
	
	/**
	 * ��ӻظ�
	 */
	public int addReply(ReplyDetail replyDetail);

}
