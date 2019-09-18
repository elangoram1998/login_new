package com.wipro.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wipro.bean.LoginBean;
import com.wipro.bean.RegisterBean;

public class LoginDao {
	
	private DataSource dataSource;
	private JdbcTemplate template;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource=dataSource;
		this.template=new JdbcTemplate(dataSource);
	}
	
	public boolean insert(RegisterBean bean)
	{
		String query="insert into login(firstname,lastname,emailid,userid,user_password)values(?,?,?,?,?)";
		int i=template.update(query,bean.getFirstName(),bean.getLastName(),bean.getEmailId(),bean.getUserId(),bean.getPassword());
		if(i>0)
		{
			return true;
		}
		return false;
	}
	public boolean checkUser(LoginBean bean)
	{
		String query="select * from login where userid=?";
		LoginBean b=template.queryForObject(query,new Object[]{bean.getUsername()}, new LoginMapper());
		if(b.getPassword().equals(bean.getPassword()))
		{
			return true;
		}
		return false;
	}
	public RegisterBean userData(String username)
	{
		String query="select * from login where userid=?";
		RegisterBean bean=template.queryForObject(query,new Object[]{username}, new RegisterMapper());
		return bean;
	}

}
