package cn.jbit.dao;

import cn.jbit.entity.House;

public interface HouseDao {

	/**
	 * 添加房屋信息
	 * @param house
	 */
	public void addHouse(House house)throws Exception;
}
