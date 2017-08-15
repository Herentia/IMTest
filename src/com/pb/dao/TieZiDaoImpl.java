package com.pb.dao;

import java.util.List;

import com.pb.basedao.BaseDaoImpl;
import com.pb.entity.Invitation;

public class TieZiDaoImpl extends BaseDaoImpl<Invitation> implements ITieZiDao {

	/**
	 * 获取无条件分页数据
	 */
	@Override
	public List<Invitation> getListAll(int currentPage, int pageSize) {
		String hql = "from Invitation";
		return super.getListAll(currentPage, pageSize, hql);
	}

	/**
	 * 获取有条件分页数据
	 */
	@Override
	public List<Invitation> getList(int currentPage, int pageSize, String title) {
		String hql = "from Invitation where title like ?";
		if(title == null && title.equals("")) {
			return super.getListAll(currentPage, pageSize, hql);
		} else {
			Object[] objs = new Object[] {"%" + title + "%"};
			return super.getList(currentPage, pageSize, hql, objs);
		}
	}

	/**
	 * 获取总记录数
	 */
	@Override
	public Long getTotalRowAll() {
		String hql = "select count(*) from Invitation";
		return super.getTotalRowAll(hql);
	}

	/**
	 * 获取带条件记录数
	 */
	@Override
	public Long getTotalRow(String title) {
		String hql = "select count(*) from Invitation";
		if(title == null && title.equals("")) {
			return super.getTotalRowAll(hql);
		} else {
			hql += " where title like ?";
			Object[] objs = new Object[] {"%" + title + "%"};
			return super.getTotalRow(hql, objs);
		}
	}

	/**
	 * 删除帖子
	 */
	@Override
	public int deleteTieZi(Invitation invitation) {
		return super.deleteTieZi(invitation);
	}

	/**
	 * 修改帖子
	 */
	@Override
	public int editTieZi(Invitation invitation) {
		return super.edit(invitation);
	}

	/**
	 * 根据ID获取帖子
	 */
	@Override
	public Invitation getTieZi(Long id) {
		return (Invitation) super.getSession().get(Invitation.class, id);
	}

}
