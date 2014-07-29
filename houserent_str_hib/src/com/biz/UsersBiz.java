package com.biz;

import java.util.List;

import com.entity.Users;

public interface UsersBiz {
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public void register(Users user) throws Exception;
	/**
	 * 登录
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public Users login(Users user) throws Exception;
}
