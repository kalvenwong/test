package com.service.impl;

import java.util.List;

import com.dao.GoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.entity.Goods;
import com.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	GoodsDao gdi=new GoodsDaoImpl();
	public Goods findById(Integer id) throws Exception {
		return gdi.findById(id);
	}

	public List<Goods> findAll() throws Exception {
		return gdi.findAll();
	}

}
