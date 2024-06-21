package com.spi;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {
	@Autowired
	private MyDataSource mds;
	@Autowired
	private MyDataSource yds;
	@Autowired
	private List<String> mappingResources;
	@Autowired
	private Properties hibernatepros;

	public List<String> getRes() {
		return mappingResources;
	}

	public Properties getpro() {
		return hibernatepros;
	}

	public MyDataSource getMds() {
		return mds;
	}

	public void setMds(MyDataSource mds) {
		this.mds = mds;
	}

	public MyDataSource getYds() {
		return yds;
	}

	public void setYds(MyDataSource yds) {
		this.yds = yds;
	}

	@Override
	public String toString() {
		return "MySessionFactory [mds=" + mds + ", yds=" + yds + ", mappingResources=" + mappingResources
				+ ", hibernatepros=" + hibernatepros + "]";
	}

	

	
}
