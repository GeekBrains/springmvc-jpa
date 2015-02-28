package com.springmvc.example.formbean;


import java.util.List;

public class User {

	private String userName;
	private String password;
	private String email;
	private List<String> profession;
	private List<String> location;
	private String gender;
	private List<String> communityList;
	private String community;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getProfession() {
		return profession;
	}
	public void setProfession(List<String> profession) {
		this.profession = profession;
	}
	public List<String> getLocation() {
		return location;
	}
	public void setLocation(List<String> location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getCommunityList() {
		return communityList;
	}
	public void setCommunityList(List<String> communityList) {
		this.communityList = communityList;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	
	
}
