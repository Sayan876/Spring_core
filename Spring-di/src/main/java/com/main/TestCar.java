package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
   public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("carengine.xml");
	Car c = context.getBean("mycar",Car.class);
	c.getE().start();
}
}
