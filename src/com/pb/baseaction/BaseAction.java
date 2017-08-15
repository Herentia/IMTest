package com.pb.baseaction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.entity.Invitation;
import com.pb.entity.ReplyDetail;
import com.pb.service.IReplyService;
import com.pb.service.ITieZiService;

public class BaseAction extends ActionSupport implements RequestAware,
		SessionAware, ServletResponseAware {
	
	protected HttpServletResponse response;
	protected Map<String, Object> session;
	protected Map<String, Object> request;
	
	protected int currentPage = 1;//设置默认当前页为第一页
	protected int pageSize = 3;//设置每页显示记录数为3
	protected long totalRow;
	protected long totalPage;
	
	protected ITieZiService tieZiService;
	protected IReplyService replyService;
	protected Invitation invitation;
	protected ReplyDetail replyDetail;

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	/**
	 * 输出
	 * @return
	 */
	protected void outWrite(String str) {
		try {
			response.setContentType("text/html; charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//-------------------------------------------
	
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(long totalRow) {
		this.totalRow = totalRow;
	}

	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public ITieZiService getTieZiService() {
		return tieZiService;
	}
	public void setTieZiService(ITieZiService tieZiService) {
		this.tieZiService = tieZiService;
	}

	public IReplyService getReplyService() {
		return replyService;
	}
	public void setReplyService(IReplyService replyService) {
		this.replyService = replyService;
	}

	public Invitation getInvitation() {
		return invitation;
	}
	public void setInvitation(Invitation invitation) {
		this.invitation = invitation;
	}

	public ReplyDetail getReplyDetail() {
		return replyDetail;
	}
	public void setReplyDetail(ReplyDetail replyDetail) {
		this.replyDetail = replyDetail;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

}
