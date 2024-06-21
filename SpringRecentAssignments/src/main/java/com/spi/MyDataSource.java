package com.spi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {
	@Value(value="${jdbc.user.url}")
	private String url;
	@Value(value="${jdbc.user.username}")
	private String username;
	@Value(value="${jdbc.user.password}")
	private String password;
	@Value(value="${jdbc.user.driverClassName}")
	private String driverClassName;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	@Override
	public String toString() {
		return "MyDataSource [url=" + url + ", username=" + username + ", password=" + password + ", driverClassName="
				+ driverClassName + "]";
	}
	

}
