package com.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
   public static void main(String[] args) {
	Resource r = new ClassPathResource("car.xml");	
	BeanFactory factory = new XmlBeanFactory(r);
//	Car c1 = (Car)factory.getBean("myCar");
//	Car c1 = factory.getBean("myCar",Car.class);
	Car c1 = factory.getBean(Car.class);
	c1.start();
}
}
