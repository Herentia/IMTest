package com.pb.dao;

import java.util.List;

import com.pb.basedao.BaseDaoImpl;
import com.pb.entity.ReplyDetail;

public class ReplyDaoImpl extends BaseDaoImpl<ReplyDetail> implements IReplyDao {

	/**
	 * ªÒ»°ªÿ∏¥
	 */
	@Override
	public List<ReplyDetail> getList(int currentPage, int pageSize, int invId) {
		String hql = "from ReplyDetail where invId = ?";
		Object[] objs = new Object[] {invId};
		return super.getList(currentPage, pageSize, hql, objs);
	}

	@Override
	public int addReply(ReplyDetail replyDetail) {
		return super.add(replyDetail);
	}

}
