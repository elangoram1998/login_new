package com.wipro.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.bean.LoginBean;
import com.wipro.bean.RegisterBean;
import com.wipro.dao.LoginDao;

@Controller
public class ControllerClass {
	
@Autowired
LoginDao dao;

	@RequestMapping("/login")
	public String loginUser(HttpServletRequest request,HttpServletResponse response,Model m)
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		LoginBean bean=new LoginBean(username,password);
		if(dao.checkUser(bean))
		{
			RegisterBean b=dao.userData(username);
			m.addAttribute("data",b);
		return "HomePage";
		}
		m.addAttribute("error", "invalid user credentials");
		return "Failure";
	}
	@RequestMapping("/register")
	public String register(Model m)
	{
		m.addAttribute("command", new RegisterBean());
		return "RegisterPage";
	}
	
	@RequestMapping("/savedata")
	public String registerUser(@ModelAttribute("register")RegisterBean register)
	{
		if(dao.insert(register))
		{
		return "index";
		}
		return "RegisterPage";
	}

}
