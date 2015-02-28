package com.springmvc.example.formbean;

public class UserFormBean {

	private LoginFormBean loginFormBean;
	
	private RegisterFormBean registerFormBean;

	public LoginFormBean getLoginFormBean() {
		return loginFormBean;
	}

	public void setLoginFormBean(LoginFormBean loginFormBean) {
		this.loginFormBean = loginFormBean;
	}

	public RegisterFormBean getRegisterFormBean() {
		return registerFormBean;
	}

	public void setRegisterFormBean(RegisterFormBean registerFormBean) {
		this.registerFormBean = registerFormBean;
	} 
}
