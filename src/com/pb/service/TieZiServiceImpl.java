package com.pb.service;

import java.util.List;

import com.pb.dao.ITieZiDao;
import com.pb.entity.Invitation;

public class TieZiServiceImpl implements ITieZiService {
	
	private ITieZiDao tieZiDao;

	@Override
	public List<Invitation> getListAll(int currentPage, int pageSize) {
		return tieZiDao.getListAll(currentPage, pageSize);
	}

	@Override
	public List<Invitation> getList(int currentPage, int pageSize, String title) {
		return tieZiDao.getList(currentPage, pageSize, title);
	}
	
	@Override
	public long getTotalRowAll() {
		return tieZiDao.getTotalRowAll();
	}

	@Override
	public long getTotalRow(String title) {
		return tieZiDao.getTotalRow(title);
	}

	@Override
	public int deletetiezi(Invitation invitation) {
		return tieZiDao.deleteTieZi(invitation);
	}

	@Override
	public Invitation gettiezi(Long id) {
		return tieZiDao.getTieZi(id);
	}

	@Override
	public int edittiezi(Invitation invitation) {
		return tieZiDao.editTieZi(invitation);
	}

	//-----------setter getter------------
	
	public ITieZiDao getTieZiDao() {
		return tieZiDao;
	}
	public void setTieZiDao(ITieZiDao tieZiDao) {
		this.tieZiDao = tieZiDao;
	}

}
