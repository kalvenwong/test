package cn.jbit.biz;

import cn.jbit.entity.House;

public interface HouseBiz {
	/**
	 * 添加房屋信息
	 * @param house
	 */
	public void addHouse(House house)throws Exception;
}
