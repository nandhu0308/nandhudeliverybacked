package com.delivery.backend.beans.requests;

/**
 * @author Ram K Bharathi
 * @created May 2, 2017
 */
public class UserLoginRequestBean {
	private String username;
	private String password;
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
}
