package com.dao.impl;

import java.util.List;

import org.hibernate.classic.Session;

import com.dao.GoodsDao;
import com.entity.Goods;
import com.entity.OrderItem;
import com.util.HibernateSessionFactory;

public class GoodsDaoImpl implements GoodsDao {

	public Goods findById(Integer id) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		return (Goods)session.load(Goods.class,id);
	}

	public List<Goods> findAll() throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		return session.createCriteria(Goods.class).list();
	}

}
