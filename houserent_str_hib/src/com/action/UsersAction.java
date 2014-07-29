package com.action;

import java.util.Map;

import com.biz.UsersBiz;
import com.biz.impl.UsersBizImpl;
import com.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport {
//	private String name;//账号
//	private String password;//密码
//	private String telephone;//电话
//	private String username;//用户名

	private String repassword;//重复密码
	private Users user;//用户
	
	/**
	 * 登录处理
	 * @return
	 */
	
	public String login(){
		UsersBiz uBiz=new UsersBizImpl();
		try {
			Map<String, Object> session=ActionContext.getContext().getSession();
			user=uBiz.login(user);
			if(user!=null){
				session.put("user", user);
				return "login_success";
			}else{
				return "login_fail";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "login_fail";
		}
	}
	/**
	 * 注册处理
	 * @return
	 */
	
	public String register(){
		UsersBiz uBiz=new UsersBizImpl();
		try {
			uBiz.register(user);
			return "reg_success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "reg_fail";
		}
		
	}
	
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getRepassword() {
//		return repassword;
//	}
//	public void setRepassword(String repassword) {
//		this.repassword = repassword;
//	}
//	public String getTelephone() {
//		return telephone;
//	}
//	public void setTelephone(String telephone) {
//		this.telephone = telephone;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
	
	
}
