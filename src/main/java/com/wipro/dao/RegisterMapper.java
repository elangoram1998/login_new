package com.wipro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wipro.bean.RegisterBean;

public class RegisterMapper implements RowMapper<RegisterBean>{

	public RegisterBean mapRow(ResultSet rs, int rowNo) throws SQLException {
		RegisterBean bean=new RegisterBean();
		bean.setFirstName(rs.getString("firstname"));
		bean.setLastName(rs.getString("lastname"));
		bean.setEmailId(rs.getString("emailid"));
		bean.setUserId(rs.getString("userid"));
		bean.setPassword(rs.getString("user_password"));
		return bean;
	}

}
