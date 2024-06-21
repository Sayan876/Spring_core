package SecondSpring;

public class MyDataSource {
	private String url;
	private String username;
	private String password;
	private String dataClassname;

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

	

	public String getDataClassname() {
		return dataClassname;
	}

	public void setDataClassname(String dataClassname) {
		this.dataClassname = dataClassname;
	}

	@Override
	public String toString() {
		return "MyDataSource [url=" + url + ", username=" + username + ", password=" + password + ", dataclassname="
				+ dataClassname + "]";
	}
	
	

}
