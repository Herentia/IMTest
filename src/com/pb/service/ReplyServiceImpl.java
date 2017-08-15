package com.pb.service;

import java.util.List;

import com.pb.dao.IReplyDao;
import com.pb.entity.ReplyDetail;

public class ReplyServiceImpl implements IReplyService {
	
	private IReplyDao replyDao;

	@Override
	public List<ReplyDetail> getList(int currentPage, int pageSize, int invId) {
		return replyDao.getList(currentPage, pageSize, invId);
	}

	@Override
	public int addReply(ReplyDetail replyDetail) {
		return replyDao.addReply(replyDetail);
	}

	//---------------------
	
	public IReplyDao getReplyDao() {
		return replyDao;
	}
	public void setReplyDao(IReplyDao replyDao) {
		this.replyDao = replyDao;
	}

}
