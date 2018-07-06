package com.au.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.au.service.UserDao;
import com.au.service.DAOException;
import com.au.model.User;

@Controller
public class UserController {
	User user = new User();
	UserDao service;
	@RequestMapping(value = "/addNew", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.OK)
	public ModelAndView handleRegisterFormRequest(HttpServletRequest request,HttpServletResponse response) {
		String username = request.getParameter("Name");
//		boolean flag=true;
			System.out.println("hello user");
//		if(password.equals(confirmPassword)) {
			
				user.setUserName(username);
				service.saveUser(user);
//				logger.info("Successfully registered");

				return new ModelAndView("index");       	    
//		}
//		request.getSession().setAttribute(REGISTRATIONFAIL, "true");					
	}
}
