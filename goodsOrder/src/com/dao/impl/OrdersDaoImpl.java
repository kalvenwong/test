package com.dao.impl;

import org.hibernate.classic.Session;

import com.dao.OrdersDao;
import com.entity.Orders;
import com.util.HibernateSessionFactory;

public class OrdersDaoImpl implements OrdersDao {

	public void save(Orders orders) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.save(orders);

	}

	public void delete(Orders orders) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.delete(orders);
		
	}

	public Orders findById(Integer id) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		return (Orders)session.load(Orders.class,id);
	}

}
