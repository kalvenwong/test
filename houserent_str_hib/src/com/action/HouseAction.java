package com.action;

import java.util.List;
import java.util.Map;

import com.biz.HouseBiz;
import com.biz.impl.HouseBizImpl;
import com.entity.District;
import com.entity.House;
import com.entity.Street;
import com.entity.Types;
import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HouseAction extends ActionSupport {
	
	private House house;
	private List<House> houseList;
	private int type_id;//户型
	private int district_id;//区
	private int street_id;//街道
	
	/**
	 * 添加房屋
	 * @return
	 */
	public String add(){
	try {
		HouseBiz hBiz = new HouseBizImpl();
		Types type = new Types();
		type.setId(type_id);
		District district = new District();
		district.setId(district_id);
		Street street = new Street();
		street.setId(street_id);
		street.setDistrict(district);
		Users user = new Users();
		user.setId(new Integer(1002));
		house.setStreet(street);
		house.setTypes(type);
		house.setUsers(user);
		
		hBiz.addHouse(house);//添加房屋方法
		return "add_success";
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return "add_fail";
	}
}
	/**
	 * 输出房屋信息
	 * @return
	 */
	public String showHouse(){
		try {
			HouseBiz hBiz = new HouseBizImpl();
			houseList = hBiz.showAllHouse();
			return "show_success";
		} catch (Exception e) {
			e.printStackTrace();
			return "show_fail";
		}
	}
	
	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public int getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}

	public int getStreet_id() {
		return street_id;
	}

	public void setStreet_id(int street_id) {
		this.street_id = street_id;
	}
	
	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
	public List<House> getHouseList() {
		return houseList;
	}
	public void setHouseList(List<House> houseList) {
		this.houseList = houseList;
	}
//	private String title;//标题
//	private int type_id;//户型
//	private int floorage;//面积
//	private int price;//价格
//	private Date houseDate;//房产日期
//	private int district_id;//区
//	private int street_id;//街道
//	private String contact;//联系方式
//	private String description;//详细信息
//	
//	/**
//	 * 添加房屋信息
//	 * @return
//	 */
//	public String add(){
//		try {
//			HouseBiz hBiz = new HouseBizImpl();
//			House house = new House();
//			house.setContact(contact);
//			house.setDescription(description);
//			house.setFloorage(floorage);
//			house.setPrice(price);
//			house.setPubdate(houseDate);
//			house.setTitle(title);
	// Types type = new Types();
	// type.setId(type_id);
	// District district = new District();
	// district.setId(district_id);
	// Street street = new Street();
	// street.setId(street_id);
	// street.setDistrict(district);
	// Users user = new Users();
	// user.setId(new Integer(1002));
	// house.setStreet(street);
	// house.setTypes(type);
	// house.setUsers(user);
//			hBiz.addHouse(house);//添加房屋方法
//			return "success";
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			return "fail";
//		}
//	}
//	
//	/**
//	 * 查询所有房屋信息
//	 * @return
//	 */
//	public String selectAll(){
//		return "";
//	}
//	
//	
//	
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public int getType_id() {
//		return type_id;
//	}
//	public void setType_id(int type_id) {
//		this.type_id = type_id;
//	}
//	public int getFloorage() {
//		return floorage;
//	}
//	public void setFloorage(int floorage) {
//		this.floorage = floorage;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public Date getHouseDate() {
//		return houseDate;
//	}
//	public void setHouseDate(Date houseDate) {
//		this.houseDate = houseDate;
//	}
//	public int getDistrict_id() {
//		return district_id;
//	}
//	public void setDistrict_id(int district_id) {
//		this.district_id = district_id;
//	}
//	public int getStreet_id() {
//		return street_id;
//	}
//	public void setStreet_id(int street_id) {
//		this.street_id = street_id;
//	}
//	public String getContact() {
//		return contact;
//	}
//	public void setContact(String contact) {
//		this.contact = contact;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	
	
}
