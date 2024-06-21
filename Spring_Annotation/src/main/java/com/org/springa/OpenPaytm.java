package com.org.springa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OpenPaytm {
    public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Paytm paytm1 = context.getBean("paytm",Paytm.class);
		paytm1.open();
	}
}
