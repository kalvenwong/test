package com.service.impl;

import com.dao.OrderitemDao;
import com.dao.impl.OrderitemDaoImpl;
import com.entity.OrderItem;
import com.service.OrderitemService;

public class OrderitemServiceImpl implements OrderitemService {
	OrderitemDao od=new OrderitemDaoImpl();
	public void save(OrderItem orderitem) throws Exception {
		od.save(orderitem);
		
	}

	public void delete(OrderItem orderitem) throws Exception {
		od.delete(orderitem);
	}

	public OrderItem findById(Integer id) throws Exception {
		return od.findById(id);
	}

}
