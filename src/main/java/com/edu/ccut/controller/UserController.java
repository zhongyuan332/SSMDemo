package com.edu.ccut.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.ccut.pojo.User;
import com.edu.ccut.service.impl.IUserServiceImpl;

/**
 *@author zhongyuan
 *@date 2016年7月11日
 */
@Controller
@RequestMapping( value = "/user")
public class UserController {
	
    private static Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private IUserServiceImpl userService;
	
	@RequestMapping(value="/login")
	public String login(User user,HttpServletRequest request,Model model){
		boolean flag = userService.login(user);
		logger.info(user.getUsername());
		logger.info(user.getPassword());
		if(flag){
			request.getSession().setAttribute("username", user.getUsername());
			return "main";
		}else{
			return "";
		}
	} 
}
