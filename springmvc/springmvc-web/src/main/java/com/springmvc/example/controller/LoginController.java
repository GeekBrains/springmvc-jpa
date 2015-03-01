package com.springmvc.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.example.formbean.LoginFormBean;
import com.springmvc.example.formbean.UserFormBean;
import com.springmvc.example.helper.LoginHelper;

/*@author: Nitin Varshney
 *
 */

@Controller
public class LoginController {

	@Autowired
	@Qualifier("LoginValidator")
	private Validator validator;
	
	@Autowired
	private LoginHelper loginHelper;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	/**
	 * View login page.
	 *
	 * @param userFormBean the user form bean
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/doLogin", method = RequestMethod.GET)
	public String viewLoginPage(@ModelAttribute("userFormBean") UserFormBean userFormBean,Model model) {
		return "/index";
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("userFormBean") @Validated UserFormBean userFormBean,
			BindingResult bindingResult,Model model, HttpServletRequest request) {
		String forwardedPath=null;
		if(bindingResult.hasErrors()){
			return "/index";
		}
		boolean isValidUser=loginHelper.isValidUser(userFormBean.getLoginFormBean(), request);
		if(isValidUser){
			forwardedPath="/dashboard";
		}else{
			model.addAttribute("msg", "error.login.invaliduser");
			forwardedPath="/index";
		}
		return forwardedPath;
	}

	@RequestMapping(value = "/doRegistration", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute("userDTO") UserFormBean userDTO,
			BindingResult bindingResult, Model model) {
		return "/dashboard";
	}
	
}
