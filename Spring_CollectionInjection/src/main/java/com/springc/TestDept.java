package com.springc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {
   public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("dept.xml");
	Department d = context.getBean("dept",Department.class);
	System.out.println(d.getDept_details());
	System.out.println(d.getEmp_detials());
	System.out.println(d.getEmp_ids());
	System.out.println(d.getEmp_names());
}
}
