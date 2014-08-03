package com.service;

import com.entity.Orders;

public interface OrdersService {
	/**
	 * 保存订单
	 * @param orders
	 */
	public void save(Orders orders)throws Exception;
	/**
	 * 删除订单
	 * @param orders
	 */
	public void delete(Orders orders)throws Exception;
	/**
	 * 根据id查找订单
	 * @param id
	 * @return
	 */
	public Orders findById(Integer id)throws Exception;
}
