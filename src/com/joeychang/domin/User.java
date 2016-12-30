package com.joeychang.domin;

public class User {
	private String id;
	private String userId;
	private String login_name;
	private String login_pwd;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getLogin_pwd() {
		return login_pwd;
	}
	public void setLogin_pwd(String login_pwd) {
		this.login_pwd = login_pwd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", login_name=" + login_name + ", login_pwd=" + login_pwd
				+ "]";
	}
}
