package com.pb.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.pb.baseaction.BaseAction;
import com.pb.entity.ReplyDetail;

public class ReplyAction extends BaseAction {
	
	private List<ReplyDetail> replylist;

	/**
	 * �鿴 �ظ�
	 * @return
	 */
	public String reply() {
		invitation = tieZiService.gettiezi(invitation.getId());
		replylist = new ArrayList<ReplyDetail>();
		Set<ReplyDetail> s = invitation.getReplyDetails();
		for(ReplyDetail replyDetail : s) {
			replylist.add(replyDetail);
		}
		return "list";
	}
	
	/**
	 * ��ת����ӻظ�ҳ��
	 * @return
	 */
	public String toaddreply() {
		return "toaddreply";
	}
	
	/**
	 * ��ӻظ�
	 * @return
	 */
	public void addreply() {
		invitation = tieZiService.gettiezi(invitation.getId());
		replyDetail.setInvitation(invitation);
		//��ʽ��ʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = new Date();
		String d = sdf.format(dd);
		try {
			Date date = sdf.parse(d);
			replyDetail.setCreatedate(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int flag = replyService.addReply(replyDetail);
		if(flag > 0) {
			super.outWrite("<script>alert('��ӳɹ���');location.href='reply?invitation.id=" + invitation.getId() + "'</script>");
		} else {
			super.outWrite("<script>alert('���ʧ�ܣ�');location.href='reply?invitation.id=" + invitation.getId() + "'</script>");
		}
	}
	
	//---------------------
	
	public List<ReplyDetail> getReplylist() {
		return replylist;
	}
	public void setReplylist(List<ReplyDetail> replylist) {
		this.replylist = replylist;
	}

}











