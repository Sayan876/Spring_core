package com.lyfcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo  {
    static {
    	System.out.println("Demo class has been loaded");
    }
    
    public Demo() {
    	System.out.println("Demo is initiazlized");
    }
    
//    public void afterPropertiesSet() throws Exception{
//    	System.out.println("Demo has been initiazlized");
//    }
//   
//
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Demo has been destroyed");
//	}
    
    public void hii() {
    	System.out.println("Demo has been initialized");
    }
    
    public void byee() {
    	System.out.println("Demo has been destroyed");
    }
}
