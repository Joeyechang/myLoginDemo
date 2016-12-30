package com.joeychang.user;

import com.joeychang.domin.User;
import com.joeychang.user.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	public User getModel(){
		return user;
	}
	
	// 注入Service 
	private IUserService service;
	public void setService(IUserService service) {
		this.service = service;
	}
	
	public String execute() throws Exception{
		System.err.println("user is:"+user);
		User user = service.login(this.user);
		System.err.println("返回以后："+user);
		if(user==null){
			System.err.println("不成功。。。。。");
			return "error";
		}else{
			System.err.println("OKOKOK");
			ActionContext.getContext().getSession().put("user",user);
			return SUCCESS;
		}
	}
}
