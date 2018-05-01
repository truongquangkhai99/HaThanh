package com.fsoft.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Content")
public class Content {
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "title")
	@NotBlank(message="không được để trống!")
	private String title;

	@NotBlank(message="không được để trống!")
	@Column(name = "brief")
	private String brief;

	@Column(name = "content")
	private String content;

	@Column(name = "createDate")
	private Date createdDate;

	@Column(name = "updateTime")
	private Date updateTime;

	@Column(name = "sort")
	private int sort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "authorId", nullable = false)
	private Member member;

	public Content() {
	}

	public Content(String title, String brief, String content, Date createdDate, Date updateTime, int sort,
			Member member) {
		super();
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.createdDate = createdDate;
		this.updateTime = updateTime;
		this.sort = sort;
		this.member = member;
	}

	public Content(int id, String title, String brief, String content, Date createdDate, Date updateTime,
			Member member) {
		super();
		this.id = id;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.createdDate = createdDate;
		this.updateTime = updateTime;
		this.member = member;
	}

	public Content(int id, String title, String brief, String content, Date createdDate, int sort, Member member) {
		super();
		this.id = id;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.createdDate = createdDate;
		this.sort = sort;
		this.member = member;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
