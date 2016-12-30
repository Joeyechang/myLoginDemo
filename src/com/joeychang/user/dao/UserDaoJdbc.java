package com.joeychang.user.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import com.joeychang.domin.User;



public class UserDaoJdbc implements IUserDao {
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	/* (non-Javadoc)
	 * @see com.joeychang.user.dao.IUserDao#login(com.joeychang.domin.User)
	 */
	@Override
	public User login(User u){
		System.err.println("在dao中:"+u);
		try{
			String sql = "select * from MUser";
			Connection con = dataSource.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.err.println(">>>>:"+rs.getString("login_name"));
				u.setId(rs.getString("id"));
				u.setUserId(rs.getString("userId"));
			}
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(u.getLogin_name()!=null && u.getLogin_name().trim().startsWith("chang") 
				&&u.getLogin_pwd()!=null && u.getLogin_pwd().startsWith("chang")){
			return u;
		}else{
			return null;
		}
	}
}
