package com.pb.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 帖子回复信息类
 * @author haohan
 *
 */
public class ReplyDetail implements Serializable {
	
	private Long id;
	private Invitation invitation;
	private String content;
	private String author;
	private Date createdate;
	
	public ReplyDetail() {
		super();
	}

	public ReplyDetail(Long id, Invitation invitation, String content,
			Date createdate) {
		super();
		this.id = id;
		this.invitation = invitation;
		this.content = content;
		this.createdate = createdate;
	}

	public ReplyDetail(Long id, Invitation invitation, String content,
			String author, Date createdate) {
		super();
		this.id = id;
		this.invitation = invitation;
		this.content = content;
		this.author = author;
		this.createdate = createdate;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Invitation getInvitation() {
		return invitation;
	}
	public void setInvitation(Invitation invitation) {
		this.invitation = invitation;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
}










