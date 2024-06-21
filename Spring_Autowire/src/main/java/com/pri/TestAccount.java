package com.pri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
   public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("phonepe.xml");
	Phonepe pe = context.getBean("phonepe",Phonepe.class);
	System.out.println(pe.getAccount().getBalance());
//	SBI si = context.getBean("icici",SBI.class);
//	System.out.println(si.getBalance());
}
}
