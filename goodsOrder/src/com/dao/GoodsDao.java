package com.dao;

import java.util.List;

import com.entity.Goods;

public interface GoodsDao {
	/**
	 * 根据id查找商品
	 * @param id
	 * @return
	 */
	public Goods findById(Integer id)throws Exception;
	/**
	 * 查找所有商品列表
	 * @return
	 */
	public List<Goods> findAll()throws Exception;
}
