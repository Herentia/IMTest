package com.pb.dao;

import java.util.List;

import com.pb.basedao.BaseDaoImpl;
import com.pb.entity.Invitation;

public class TieZiDaoImpl extends BaseDaoImpl<Invitation> implements ITieZiDao {

	/**
	 * ��ȡ��������ҳ����
	 */
	@Override
	public List<Invitation> getListAll(int currentPage, int pageSize) {
		String hql = "from Invitation";
		return super.getListAll(currentPage, pageSize, hql);
	}

	/**
	 * ��ȡ��������ҳ����
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
	 * ��ȡ�ܼ�¼��
	 */
	@Override
	public Long getTotalRowAll() {
		String hql = "select count(*) from Invitation";
		return super.getTotalRowAll(hql);
	}

	/**
	 * ��ȡ��������¼��
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
	 * ɾ������
	 */
	@Override
	public int deleteTieZi(Invitation invitation) {
		return super.deleteTieZi(invitation);
	}

	/**
	 * �޸�����
	 */
	@Override
	public int editTieZi(Invitation invitation) {
		return super.edit(invitation);
	}

	/**
	 * ����ID��ȡ����
	 */
	@Override
	public Invitation getTieZi(Long id) {
		return (Invitation) super.getSession().get(Invitation.class, id);
	}

}
