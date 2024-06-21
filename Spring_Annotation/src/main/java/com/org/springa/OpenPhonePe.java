package com.org.springa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenPhonePe {
   public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.scan("com.org.springa");
	context.refresh();
	Phonepe phonepe = context.getBean("phonepe",Phonepe.class);
	phonepe.open();
}
}
