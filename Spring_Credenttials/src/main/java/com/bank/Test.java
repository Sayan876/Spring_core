package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
	Paytm paytm = context.getBean(Paytm.class);
    paytm.getAccount().displayBalance();
}
}
