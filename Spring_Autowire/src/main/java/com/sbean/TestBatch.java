package com.sbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBatch {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	Batch batch = context.getBean(Batch.class);
	System.out.println(batch.getStudentNames());
}
}
