package com.biz;

import java.util.List;

import com.entity.House;

public interface HouseBiz {
	/**
	 * 添加房屋信息
	 * @param house
	 */
	public void addHouse(House house)throws Exception;
	
	/**
	 * 显示全部房屋信息
	 * @return
	 */
	public List<House> showAllHouse()throws Exception;
}
