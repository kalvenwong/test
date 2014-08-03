package com.action;

import java.util.ArrayList;
import java.util.List;

import com.entity.Goods;
import com.opensymphony.xwork2.ActionSupport;
import com.service.GoodsService;
import com.service.impl.GoodsServiceImpl;

public class OrdersAction extends ActionSupport {
	 //laptop git test
	private List<Goods> goodsList =new ArrayList<Goods>();//商品列表
	private Integer[] gids;//商品id
	private Goods goods;//商品
	GoodsService gs=new GoodsServiceImpl();
	/**
	 * 显示商品列表
	 * @return
	 */
	private String abd;
	public String showGoods(){
	
		try {
			 goodsList=gs.findAll();
			 for (Goods g : goodsList) {
				g.getName();
			}
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
	}
	/**
	 * 购买商品
	 * @return
	 */
	public String buyGoods(){
		GoodsService gs=new GoodsServiceImpl();
		try {
			if(gids==null){
				return INPUT;
			}
			for (Integer gid : gids) {
				 goods=gs.findById(gid);
				 goodsList.add(goods);
			}
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
	}
	
	/**
	 * 添加订单
	 * @return
	 */
	public String addorder(){
		return null;
	}
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	public Integer[] getGids() {
		return gids;
	}
	public void setGids(Integer[] gids) {
		this.gids = gids;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}

}
