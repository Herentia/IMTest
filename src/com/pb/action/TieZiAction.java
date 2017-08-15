package com.pb.action;

import java.util.List;

import com.pb.baseaction.BaseAction;
import com.pb.entity.Invitation;

public class TieZiAction extends BaseAction {
	
	private List<Invitation> list;
	
	/**
	 * 不带条件分页
	 * @return
	 */
	public String tiezi() {
		list = tieZiService.getListAll(currentPage, pageSize);
		totalRow = tieZiService.getTotalRowAll();
		totalPage = totalRow % pageSize == 0 ? totalRow / pageSize : totalRow / pageSize + 1;
		return "list";
	}
	
	/**
	 * 带条件分页
	 * @return
	 */
	public String tieziSearch() {
		list = tieZiService.getList(currentPage, pageSize, invitation.getTitle());
		totalRow = tieZiService.getTotalRow(invitation.getTitle());
		totalPage = totalRow % pageSize == 0 ? totalRow / pageSize : totalRow / pageSize + 1;
		return "listSearch";
	}
	
	/**
	 * 删除帖子
	 * @return
	 */
	public String deletetiezi() {
		invitation = tieZiService.gettiezi(invitation.getId());
		int flag = tieZiService.deletetiezi(invitation);
		if(flag > 0) {
			super.outWrite("<script>alert('删除成功')</script>");
		}
		return "redirect1";
	}
	
	/**
	 * 修改帖子
	 * @return
	 */
	public String edittiezi() {
		Invitation inv = tieZiService.gettiezi(invitation.getId());
		inv.setTitle(invitation.getTitle());
		inv.setSummary(invitation.getSummary());
		int flag = tieZiService.edittiezi(inv);
		
		if(flag > 0) {
			super.outWrite("<script>alert('修改成功！')</script>");
			return "redirect1";
		} else {
			super.outWrite("<script>alert('修改失败！')</script>");
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
