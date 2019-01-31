package com.txl.activewish.ActiveWish.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "am_monitor_currentfile")
public class ActiveWishFile implements Serializable {
	
	// 标识id
	@Id
	@Column(length=50)
	private String id;
	
	// 文件名
	@Column(nullable = false,length=500)
	private String name;
	
	// 文件路径名
	@Column(nullable = false,length=2000)
	private String pathname;
	
	// 文件大小(byte)
	@Column(length=50)
	private String size;
	
	// 创建人编码
	@Column(length=255)
	private String creatercode;
	
	// 创建人姓名
	@Column(length=255)
	private String creatername;
	
	// 创建时间
	@Column(columnDefinition="timestamp")
	private Date createtime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPathname() {
		return pathname;
	}

	public void setPathname(String pathname) {
		this.pathname = pathname;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCreatercode() {
		return creatercode;
	}

	public void setCreatercode(String creatercode) {
		this.creatercode = creatercode;
	}

	public String getCreatername() {
		return creatername;
	}

	public void setCreatername(String creatername) {
		this.creatername = creatername;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
