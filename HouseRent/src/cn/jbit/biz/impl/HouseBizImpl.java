package cn.jbit.biz.impl;

import cn.jbit.biz.HouseBiz;
import cn.jbit.dao.HouseDao;
import cn.jbit.dao.impl.HouseDaoImpl;
import cn.jbit.entity.House;

public class HouseBizImpl implements HouseBiz {
	HouseDao hDao=new HouseDaoImpl();
	public void addHouse(House house)throws Exception {
		hDao.addHouse(house);
	}

}
