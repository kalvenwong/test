package com.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String address;
	private Date createtime;
	private Set orderItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/** full constructor */
	public Orders(String name, String address, Date createtime, Set orderItems) {
		this.name = name;
		this.address = address;
		this.createtime = createtime;
		this.orderItems = orderItems;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Set getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(Set orderItems) {
		this.orderItems = orderItems;
	}

}