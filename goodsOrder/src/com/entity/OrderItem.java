package com.entity;


/**
 * OrderItem entity. @author MyEclipse Persistence Tools
 */

public class OrderItem implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Orders orders;
	private Integer amount;

	// Constructors

	/** default constructor */
	public OrderItem() {
	}

	/** full constructor */
	public OrderItem(Goods goods, Orders orders, Integer amount) {
		this.goods = goods;
		this.orders = orders;
		this.amount = amount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}