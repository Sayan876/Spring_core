package com.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar {
    public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Car car = context.getBean("car",Car.class);
		car.getEngine().start();
		System.out.println(car);
	}
}
