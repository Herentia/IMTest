package com.pb.action;

import java.util.List;

import com.pb.baseaction.BaseAction;
import com.pb.entity.Invitation;

public class TieZiAction extends BaseAction {
	
	private List<Invitation> list;
	
	/**
	 * ����������ҳ
	 * @return
	 */
	public String tiezi() {
		list = tieZiService.getListAll(currentPage, pageSize);
		totalRow = tieZiService.getTotalRowAll();
		totalPage = totalRow % pageSize == 0 ? totalRow / pageSize : totalRow / pageSize + 1;
		return "list";
	}
	
	/**
	 * ��������ҳ
	 * @return
	 */
	public String tieziSearch() {
		list = tieZiService.getList(currentPage, pageSize, invitation.getTitle());
		totalRow = tieZiService.getTotalRow(invitation.getTitle());
		totalPage = totalRow % pageSize == 0 ? totalRow / pageSize : totalRow / pageSize + 1;
		return "listSearch";
	}
	
	/**
	 * ɾ������
	 * @return
	 */
	public String deletetiezi() {
		invitation = tieZiService.gettiezi(invitation.getId());
		int flag = tieZiService.deletetiezi(invitation);
		if(flag > 0) {
			super.outWrite("<script>alert('ɾ���ɹ�')</script>");
		}
		return "redirect1";
	}
	
	/**
	 * �޸�����
	 * @return
	 */
	public String edittiezi() {
		Invitation inv = tieZiService.gettiezi(invitation.getId());
		inv.setTitle(invitation.getTitle());
		inv.setSummary(invitation.getSummary());
		int flag = tieZiService.edittiezi(inv);
		
		if(flag > 0) {
			super.outWrite("<script>alert('�޸ĳɹ���')</script>");
			return "redirect1";
		} else {
			super.outWrite("<script>alert('�޸�ʧ�ܣ�')</script>");
			return "redirect1";
		}
	}

	
	//---------------setter getter--------------------
	
	public List<Invitation> getList() {
		return list;
	}
	public void setList(List<Invitation> list) {
		this.list = list;
	}
	
	

}
