package com.mds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySessionFactory {
	@Autowired
	private MyDataSource mds;

	public MySessionFactory() {

	}

	public MyDataSource getMds() {
		return mds;
	}

	public void setMds(MyDataSource mds) {
		this.mds = mds;
	}

	@Override
	public String toString() {
		return "MySessionFactory [mds=" + mds + "]";
	}
	
	

}
