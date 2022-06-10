package com.wipro.niit.SecurityDemo.model;

import java.io.Serializable;

public class MyRequest implements Serializable {

	private String username;
	private String password;

	public MyRequest() {
		// TODO Auto-generated constructor stub
	}

	public MyRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyRequest [username=" + username + ", password=" + password + "]";
	}

}
