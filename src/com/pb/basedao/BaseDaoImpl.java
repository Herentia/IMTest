package com.pb.basedao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {

	/**
	 * ��������ֵ
	 */
	private void setParams(Object[] objs, Query query) {
		if(objs != null) {
			for(int i = 0; i < objs.length; i++) {
				query.setParameter(i, objs[i]);
			}
		}
	}
	
	/**
	 * ��ȡ���ж���---��������ҳ
	 */
	@Override
	public List<T> getListAll(int currentPage, int pageSize, String hql) {
		Query query = getSession().createQuery(hql);
		//��������ֵ
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * ��������ҳ
	 */
	@Override
	public List<T> getList(int currentPage, int pageSize, String hql,
			Object[] objs) {
		Query query = getSession().createQuery(hql);
		//��������ֵ
		setParams(objs, query);
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * ��ȡ�ܼ�¼��
	 */
	@Override
	public Long getTotalRowAll(String hql) {
		Query query = getSession().createQuery(hql);
		Long totalRowAll = (Long) query.uniqueResult();
		return totalRowAll;
	}

	/**
	 * ��ȡ�������ļ�¼��
	 */
	@Override
	public Long getTotalRow(String hql, Object[] objs) {
		Query query = getSession().createQuery(hql);
		setParams(objs, query);
		Long totalRow = (Long) query.uniqueResult();
		return totalRow;
	}

	/**
	 * ɾ������
	 */
	@Override
	public int deleteTieZi(T t) {
		int flag = 0;//Ĭ��ɾ��Ϊʧ��
		try {
			getHibernateTemplate().delete(t);
			flag = 1;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * ����
	 */
	@Override
	public int add(T t) {
		int flag = 0;
		try {
			getHibernateTemplate().save(t);
			flag = 1;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * �޸Ķ���
	 */
	@Override
	public int edit(T t) {
		int flag = 0;
		try {
			getHibernateTemplate().update(t);
			flag = 1;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
