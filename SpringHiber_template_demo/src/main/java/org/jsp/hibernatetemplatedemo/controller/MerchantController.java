package org.jsp.hibernatetemplatedemo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.jsp.hibernatetemplatedemo.dto.*;

public class MerchantController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HibernateTemplate template = context.getBean("hibernateTemplate",HibernateTemplate.class);
		System.out.println(template);
	}
}
