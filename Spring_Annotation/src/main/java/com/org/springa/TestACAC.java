package com.org.springa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestACAC {
    public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.org.Springa");
		Phonepe phonepe = context.getBean("phonepe",Phonepe.class);
		Paytm paytm = context.getBean("paytm",Paytm.class);
		phonepe.open();
		paytm.open();
	}
}
