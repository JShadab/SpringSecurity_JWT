package com.wipro.niit.SecurityDemo.model;

public class MyResponse {

	private String jwtStr;

	public MyResponse(String jwtStr) {
		super();
		this.jwtStr = jwtStr;
	}

	public String getJwtStr() {
		return jwtStr;
	}

	public void setJwtStr(String jwtStr) {
		this.jwtStr = jwtStr;
	}

	@Override
	public String toString() {
		return "MyResponse [jwtStr=" + jwtStr + "]";
	}

}
