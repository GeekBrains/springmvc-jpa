package com.springmvc.example.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.springmvc.example.formbean.LoginFormBean;
import com.springmvc.example.formbean.UserFormBean;

@Component(value = "LoginValidator")
public class LoginValidator implements Validator {

	private static final String EMAIL_ID = "loginFormBean.emailId";

	private static final String PASSWORD = "loginFormBean.password";

	@Override
	public boolean supports(Class<?> paramClass) {
		return UserFormBean.class.equals(paramClass);
	}

	@Override
	public void validate(Object obj, Errors error) {
		UserFormBean userFormBean = (UserFormBean) obj;
		
		if (ValidationHelper.isBlank(userFormBean.getLoginFormBean().getEmailId())) {
			error.rejectValue(EMAIL_ID, "error.login.emailId.empty");
		} else if (!ValidationHelper.isValidEmail(userFormBean.getLoginFormBean().getEmailId())) {
			error.rejectValue(EMAIL_ID, "error.login.emailId.regex.notmatched");
		}
		if (ValidationHelper.isBlank(userFormBean.getLoginFormBean().getPassword())) {
			error.rejectValue(PASSWORD, "error.login.password.empty");
		}
	}

}
