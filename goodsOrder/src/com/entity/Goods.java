package com.entity;


import java.util.HashSet;
import java.util.Set;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Double price;
	private String name;
	private String specification;
	private String manufacturer;
	private Set orderItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(Double price, String name, String specification,
			String manufacturer, Set orderItems) {
		this.price = price;
		this.name = name;
		this.specification = specification;
		this.manufacturer = manufacturer;
		this.orderItems = orderItems;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return this.specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Set getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(Set orderItems) {
		this.orderItems = orderItems;
	}

}