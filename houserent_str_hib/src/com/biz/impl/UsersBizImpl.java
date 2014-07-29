package com.biz.impl;

import java.util.List;

import com.biz.UsersBiz;
import com.dao.UsersDao;
import com.dao.impl.UsersDaoImpl;
import com.entity.Users;

public class UsersBizImpl implements UsersBiz {
	UsersDao uDao=new UsersDaoImpl();
	@Override
	public void register(Users user) throws Exception {
		uDao.register(user);

	}

	@Override
	public Users login(Users user) throws Exception {
				List<Users> userslist=uDao.login(user);
				if(userslist.size()>0){
					return userslist.get(0);
				}else{
					return null;
				}
				
	}

}
