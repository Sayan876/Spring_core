package FirstSpring;

public class MyDataSource {
	private String url;
	private String username;
	private String password;
	private String dataClassName;

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

	public String getDataClassName() {
		return dataClassName;
	}

	public void setDataClassName(String dataClassName) {
		this.dataClassName = dataClassName;
	}

	@Override
	public String toString() {
		return "MyDataSource [url=" + url + ", username=" + username + ", password=" + password + ", dataClassName="
				+ dataClassName + "]";
	}

}
