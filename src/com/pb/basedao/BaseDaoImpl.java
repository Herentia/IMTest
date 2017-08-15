package com.pb.basedao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {

	/**
	 * 给参数赋值
	 */
	private void setParams(Object[] objs, Query query) {
		if(objs != null) {
			for(int i = 0; i < objs.length; i++) {
				query.setParameter(i, objs[i]);
			}
		}
	}
	
	/**
	 * 获取所有对象---无条件分页
	 */
	@Override
	public List<T> getListAll(int currentPage, int pageSize, String hql) {
		Query query = getSession().createQuery(hql);
		//给参数赋值
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * 带条件分页
	 */
	@Override
	public List<T> getList(int currentPage, int pageSize, String hql,
			Object[] objs) {
		Query query = getSession().createQuery(hql);
		//给参数赋值
		setParams(objs, query);
		query.setFirstResult((currentPage - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

	/**
	 * 获取总记录数
	 */
	@Override
	public Long getTotalRowAll(String hql) {
		Query query = getSession().createQuery(hql);
		Long totalRowAll = (Long) query.uniqueResult();
		return totalRowAll;
	}

	/**
	 * 获取带条件的记录数
	 */
	@Override
	public Long getTotalRow(String hql, Object[] objs) {
		Query query = getSession().createQuery(hql);
		setParams(objs, query);
		Long totalRow = (Long) query.uniqueResult();
		return totalRow;
	}

	/**
	 * 删除帖子
	 */
	@Override
	public int deleteTieZi(T t) {
		int flag = 0;//默认删除为失败
		try {
			getHibernateTemplate().delete(t);
			flag = 1;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 增加
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
	 * 修改对象
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
