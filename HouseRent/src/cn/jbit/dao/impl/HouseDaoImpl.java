package cn.jbit.dao.impl;

import org.hibernate.classic.Session;

import cn.jbit.dao.HouseDao;
import cn.jbit.entity.House;
import cn.jbit.util.HibernateSessionFactory;

public class HouseDaoImpl implements HouseDao {

	public void addHouse(House house)throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.save(house);
	}

}
