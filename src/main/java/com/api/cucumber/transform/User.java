package com.api.cucumber.transform;

public class User {
	public User(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	private String username;
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassWord() {
		return password;
	}
	public void setPassWord(String password) {
		this.password = password;
	}
	private String password;
	
	

}
