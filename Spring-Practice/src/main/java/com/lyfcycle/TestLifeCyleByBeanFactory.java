package com.lyfcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCyleByBeanFactory {
   public static void main(String[] args) {
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("lifecycle.xml");
	System.out.println(context.getBean("demo",Demo.class));
	System.out.println(context.getBean("demo",Demo.class));
	System.out.println(context.getBean("demo",Demo.class));
	((ClassPathXmlApplicationContext)context).close();
}
}
