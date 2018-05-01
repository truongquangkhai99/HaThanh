package com.fsoft.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Member")
@NamedNativeQueries({
	@NamedNativeQuery(name="findAll", query="SELECT * FROM Member")
})
public class Member {
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "userName")
	private String userName;

	@NotEmpty(message = "Password không được trống!")
	@Length(max = 15, min = 8, message = "Password không đúng kích thước")
	@Column(name = "password")
	private String password;

	@Column(name = "phone")
	private String phone;

	@Column(name = "description")
	private String description;

	@Email(message = "Bạn phải nhập đúng format email!")
	@NotEmpty(message = "Email không được trống!")
	@Column(name = "email")
	private String email;

	@Column(name = "createdDate")
	private Date createdDate;

	@Column(name = "updateTime")
	private Date updateTime;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	private List<Content> contents = new ArrayList<>();

	public Member() {
		super();
	}

	public Member(String firstName, String lastName, String userName, String password, String phone, String description,
			String email, Date createdDate, Date updateTime, List<Content> contents) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.description = description;
		this.email = email;
		this.createdDate = createdDate;
		this.updateTime = updateTime;
		this.contents = contents;
	}

	public Member(String userName, String password, String email, Date createdDate) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

}
