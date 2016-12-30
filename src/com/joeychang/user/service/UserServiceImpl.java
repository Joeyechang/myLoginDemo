package com.joeychang.user.service;

import com.joeychang.domin.User;
import com.joeychang.user.dao.IUserDao;

public class UserServiceImpl implements IUserService {
	//注入IUserDao
	private IUserDao dao;
	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	
	/* (non-Javadoc)
	 * @see com.joeychang.user.service.IUserService#login(com.joeychang.domin.User)
	 */
	@Override
	public User login(User u){
		return dao.login(u);
	}
}
