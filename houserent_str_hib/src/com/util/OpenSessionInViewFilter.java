package com.util;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OpenSessionInViewFilter  implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		Session session=null;
		Transaction tx=null;
		try {
			session=HibernateSessionFactory.getSessionFactory().getCurrentSession();
			tx=session.beginTransaction();
			chain.doFilter(req, resp);
			System.out.println("@@@@@");
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	

}
