package com.service.impl;

import com.dao.OrdersDao;
import com.dao.impl.OrdersDaoImpl;
import com.entity.Orders;
import com.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {
	OrdersDao od=new OrdersDaoImpl();
	public void save(Orders orders) throws Exception {
		od.save(orders);
	}

	public void delete(Orders orders) throws Exception {
		od.delete(orders);
	}

	public Orders findById(Integer id) throws Exception {
		return od.findById(id);
	}

}
