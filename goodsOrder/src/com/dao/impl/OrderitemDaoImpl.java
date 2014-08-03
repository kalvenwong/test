package com.dao.impl;

import org.hibernate.classic.Session;

import com.dao.OrderitemDao;
import com.entity.OrderItem;
import com.entity.Orders;
import com.util.HibernateSessionFactory;

public class OrderitemDaoImpl implements OrderitemDao {

	public void save(OrderItem orderitem) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.save(orderitem);
	}

	public void delete(OrderItem orderitem) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.delete(orderitem);
	}

	public OrderItem findById(Integer id) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		return (OrderItem)session.load(OrderItem.class,id);
	}

}
