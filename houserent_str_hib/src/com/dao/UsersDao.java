package com.dao;

import java.util.List;

import com.entity.Users;

public interface UsersDao {
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
	public List<Users> login(Users user) throws Exception;
}
