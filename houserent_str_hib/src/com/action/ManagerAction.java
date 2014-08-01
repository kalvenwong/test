package com.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.biz.FindPageByQueryBiz;
import com.biz.impl.FindPageByQueryBizImpl;
import com.entity.House;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport {
	private int number;//页码
	private int total;//总页数
	private int prev;
	private int next;
	
	private List<House> result;
	public static final int RECORD_SIZE=3;
	
	/**
	 * 分页显示房屋信息
	 * @return
	 */
	public String houseListByPages(){
		if(number==0){
			number=1;
		}
		FindPageByQueryBiz fpbqBiz=new FindPageByQueryBizImpl();
		String hqlByPage="from House";
		//得到当前页面所有的房屋对象
//		Map<String ,Object> map=new HashMap<String,Object>();
//		map.put("price", "2000");
		List<Object> hList=fpbqBiz.findPageByQuery(number, RECORD_SIZE, hqlByPage, null);
		 result = new ArrayList<House>();
		for (Object object : hList) {
			House obj = (House) object;
			result.add(obj);
		}
		String hqlByCount="select count(id) from House";
		//查询总房屋信息记录数
		int count=fpbqBiz.getTotalCount(hqlByCount, null);
		total= count % RECORD_SIZE == 0 ? count / RECORD_SIZE
						: count / RECORD_SIZE + 1;// 总页数
		next=number;
		prev=number;
		if(prev<=0){
			prev=1;
			next++;
		}else if(next>=total){
			next=total;
			prev--;
		}else{
			next++;
			prev--;
		}
		return SUCCESS;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public List<House> getResult() {
		return result;
	}

	public void setResult(List<House> result) {
		this.result = result;
	}

	public static int getRecordSize() {
		return RECORD_SIZE;
	}
	
	
}
