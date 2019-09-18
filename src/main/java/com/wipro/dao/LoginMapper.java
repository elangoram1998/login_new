package com.wipro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wipro.bean.LoginBean;

public class LoginMapper implements RowMapper<LoginBean>{

	public LoginBean mapRow(ResultSet rs, int rowNO) throws SQLException {
		LoginBean bean=new LoginBean();
		bean.setUsername(rs.getString("userid"));
		bean.setPassword(rs.getString("user_password"));
		return bean;
	}

}
