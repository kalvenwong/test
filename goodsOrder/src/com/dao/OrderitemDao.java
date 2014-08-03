package com.dao;

import com.entity.OrderItem;

public interface OrderitemDao {
	/**
	 * 保存订单明细
	 * @param orderitem
	 */
	public void save(OrderItem orderitem)throws Exception;
	/**
	 * 删除订单明细
	 * @param orderitem
	 */
	public void delete(OrderItem orderitem)throws Exception;
	/**
	 * 根据id查找订单明细
	 * @param id
	 * @return
	 */
	public OrderItem findById(Integer id)throws Exception;
}
