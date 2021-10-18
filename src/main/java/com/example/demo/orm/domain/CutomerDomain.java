package com.example.demo.orm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mst_member")
public class CutomerDomain implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2215503732969699263L;

	@Id
	@Column(name = "memberid")
	private long memberID;

	public void setMemberID(long memberID) {
		this.memberID = memberID;
	}

	public long getMemberID() {
		return this.memberID;
	}

	@Column(name = "mobile")
	private long mobile;

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getMobile() {
		return this.mobile;
	}

	@Column(name = "name", length = 100)
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Column(name = "status")
	private Integer status;

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return this.status;
	}

	@Column(name = "createtime")
	private String createTime;

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	@Column(name = "creater", length = 48)
	private String creater;

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getCreater() {
		return this.creater;
	}
}
