package com.dao.impl;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.dao.FindPageByQueryDao;
import com.util.HibernateSessionFactory;

public class FindPageByQueryDaoImpl implements FindPageByQueryDao {
	/**
	 * @function 分页显示符合所有的记录数，将查询结果封装为Pager
	 * @param pageNo
	 *            当前页数
	 * @param pageSize
	 *            每页显示的条数
	 * @param instance
	 *            将查询条件封装为JavaBean
	 * @return 查询结果Pager
	 */
	public List<Object> findPageByQuery(int pageNo, int pageSize, String hql,
			Map map) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		List<Object> result = null;
		try {
			Query query = session.createQuery(hql);
			if(map!=null){
				Iterator it = map.keySet().iterator();
				while (it.hasNext()) {
					Object key = it.next();
					query.setParameter(key.toString(), map.get(key));
				}
			}
			query.setFirstResult((pageNo - 1) * pageSize);
			query.setMaxResults(pageSize);
			result = query.list();
			System.out.println("result"+result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @function 根据查询条件查询记录数的个数
	 * @param hql
	 *            hql查询语句
	 * @param map
	 *            用map封装查询条件
	 * @return 数据库中满足查询条件的数据的条数
	 */
	public int getTotalCount(String hql, Map map) {
		Session session = HibernateSessionFactory.getSessionFactory()
				.getCurrentSession();
		try {
			Query query = session.createQuery(hql);
			if (map != null) {
				Iterator it = map.keySet().iterator();
				while (it.hasNext()) {
					Object key = it.next();
					System.out.println("key"+key.toString());
					System.out.println("value"+map.get(key));
					query.setParameter(key.toString(), map.get(key));
				}
			}
			Integer i=((Number)(query.list().get(0))).intValue();
			return i;
		} catch (RuntimeException re) {
			throw re;
		}
	}

}
