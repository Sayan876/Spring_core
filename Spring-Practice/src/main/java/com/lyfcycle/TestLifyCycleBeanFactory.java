package com.lyfcycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestLifyCycleBeanFactory {
    public static void main(String[] args) {
		Resource r = new ClassPathResource("lifecycle.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println(factory.getBean("demo",Demo.class));
		System.out.println(factory.getBean("demo",Demo.class));
		System.out.println(factory.getBean("demo",Demo.class));
	}
}
