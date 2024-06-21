package com.mds;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestData {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	MySessionFactory mySessionFactory = context.getBean("mySessionFactory", MySessionFactory.class);
	mySessionFactory.getMds().getUsername();
	System.out.println(mySessionFactory);
   }
}
