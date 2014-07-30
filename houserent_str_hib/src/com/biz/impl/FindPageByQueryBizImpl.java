package com.biz.impl;

import java.util.List;
import java.util.Map;

import com.biz.FindPageByQueryBiz;
import com.dao.FindPageByQueryDao;
import com.dao.impl.FindPageByQueryDaoImpl;

public class FindPageByQueryBizImpl implements FindPageByQueryBiz {
	FindPageByQueryDao fpbqDao=new FindPageByQueryDaoImpl();
	@Override
	public List<Object> findPageByQuery(int pageNo, int pageSize, String hql,
			Map map) {
		return fpbqDao.findPageByQuery(pageNo, pageSize, hql, map);
	}

	@Override
	public int getTotalCount(String hql, Map map) {
		
		return fpbqDao.getTotalCount(hql, map);
	}

}
