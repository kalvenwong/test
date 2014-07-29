package com.biz.impl;

import java.util.List;

import com.biz.HouseBiz;
import com.dao.HouseDao;
import com.dao.impl.HouseDaoImpl;
import com.entity.House;

public class HouseBizImpl implements HouseBiz {
	HouseDao hDao=new HouseDaoImpl();
	public void addHouse(House house)throws Exception {
		hDao.addHouse(house);
	}
	@Override
	public List<House> showAllHouse() throws Exception{
		return hDao.showAllHouse();
	}

}
