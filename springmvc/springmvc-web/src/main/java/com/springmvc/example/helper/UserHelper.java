package com.springmvc.example.helper;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.example.dto.UserDTO;
import com.springmvc.example.exception.SpringMVCException;
import com.springmvc.example.formbean.LoginFormBean;
import com.springmvc.example.service.UserService;

@Component
public class UserHelper {

	@Autowired
	private UserService userService;

	public boolean isValidUser(LoginFormBean loginFormBean, HttpServletRequest request) {
		UserDTO dto=null;
		boolean isValidUser=false;
		try {
				dto=new UserDTO();
				dto.setEmailId(loginFormBean.getEmailId());
				dto.setPassword(loginFormBean.getPassword());
				dto=userService.getUser(dto);
				if(dto!=null){
					isValidUser=true;
					request.getSession().setAttribute("user",dto);
				}
		} catch (SpringMVCException e) {
			isValidUser=false;
		}
		return isValidUser;
	}

}
