package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {
  public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
	Car c = context.getBean("mycar",Car.class);
	c.getEngine().start();
}
}
