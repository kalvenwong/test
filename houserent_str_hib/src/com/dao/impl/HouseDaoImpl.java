package com.dao.impl;

import java.util.List;

import org.hibernate.classic.Session;

import com.dao.HouseDao;
import com.entity.House;
import com.util.HibernateSessionFactory;

public class HouseDaoImpl implements HouseDao {

	public void addHouse(House house)throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.save(house);
	}

	@Override
	public List<House> showAllHouse() throws Exception{
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
//		return session.createCriteria(House.class).list();
		String hql="from House";
		List<House> houseList=session.createQuery(hql).list();
		return houseList;
	}

}
