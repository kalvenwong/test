package com.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.dao.UsersDao;
import com.entity.Users;
import com.util.HibernateSessionFactory;

public class UsersDaoImpl implements UsersDao {

	@Override
	public void register(Users user) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		session.save(user);
	}

	@Override
	public List<Users> login(Users user) throws Exception {
		Session session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
		return session.createCriteria(Users.class).add(Example.create(user)).list();
	}

}
