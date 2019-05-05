package com.api.cucumber.transform;

public class UserDetails {
	
	public UserDetails(String username,String password,String address) {
		this.username = username;
		this.password = password;
		this.address = address;
	}
	
	private String username;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}
	private String password;
	private String address;
	
	@Override
	public String toString() {
		return String.format("Username = %s , Password = %s , Address = %s", this.username,this.password,this.address);
	}

}
