package com.joeychang.user.dao;

import com.joeychang.domin.User;

public interface IUserDao {

	/**
	 * 用户登录功能
	 */
	User login(User u);

}