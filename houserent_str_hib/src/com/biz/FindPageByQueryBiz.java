package com.biz;

import java.util.List;
import java.util.Map;

public interface FindPageByQueryBiz {
	/**
	* @function 分页显示符合所有的记录数，将查询结果封装为Pager
	* @param pageNo
	*            当前页数
	* @param pageSize
	*            每页显示的条数
	* @param instance
	*            将查询条件封装为专家Bean
	* @return 查询结果Pager
	*/
	public List<Object> findPageByQuery(int pageNo, int pageSize, String hql,
			Map map);
	/**
	* @function 根据查询条件查询记录数的个数
	* @param hql
	*             hql查询语句
	* @param map
	*             用map封装查询条件
	* @return 数据库中满足查询条件的数据的条数
	*/  
	public int getTotalCount(String hql, Map map);
}
