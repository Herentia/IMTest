package com.pb.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 帖子类
 * @author haohan
 *
 */
public class Invitation implements Serializable {
	
	private Long id;		//ID
	private String title;	//标题
	private String summary; //摘要
	private String author;  //作者
	private Date createtime;//新建时间
	private Set replyDetails = new HashSet();//回去帖子
	
	public Invitation() {
		super();
	}

	public Invitation(Long id, String title, Date createtime) {
		super();
		this.id = id;
		this.title = title;
		this.createtime = createtime;
	}

	public Invitation(Long id, String title, String summary, String author,
			Date createtime, Set replyDetails) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createtime = createtime;
		this.replyDetails = replyDetails;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Set getReplyDetails() {
		return replyDetails;
	}
	public void setReplyDetails(Set replyDetails) {
		this.replyDetails = replyDetails;
	}
	

}










