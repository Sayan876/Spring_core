package com.org;

public class MyDataSource {
	private String driverClassName;
	private String user;
	private String password;
	private String url;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public void Display() {
		System.out.println("DriverClassName"+driverClassName);
		System.out.println("User"+user);
		System.out.println("Password"+password);
		System.out.println("Url"+url);
	}

}
