package com.spi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	MyDataSource mdss = context.getBean(MyDataSource.class);
	MySessionFactory msf = context.getBean(MySessionFactory.class);
	System.out.println(mdss);
	mdss.getDriverClassName();
	System.out.println(mdss.getDriverClassName());
	
	
	System.out.println("Fetching the Properties");
	System.out.println(msf.getpro());
	System.out.println("Fetching the Resources");
	System.out.println(msf.getRes());
	System.out.println("Fetching MyDataSource from MySessionFactory");
	System.out.println(msf.getMds());
	System.out.println("Fetching YourDataSource from MySessionFactory");
	System.out.println(msf.getYds());
	System.out.println("Fetching everything....");
	System.out.println(msf);
	
}
}
