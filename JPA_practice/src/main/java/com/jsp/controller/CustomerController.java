package com.jsp.controller;
import com.jsp.dto.*;
import com.jsp.AppConfig;
import com.jsp.dao.*;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerController {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	CustomerDao cdao = context.getBean(CustomerDao.class);
	System.out.println("1.Save Customer\n2.Update Customer\n3.Find by id\n4.Verify by email and pass\n5.Verify by phone and pass");
	
	Scanner sc = new Scanner(System.in);
	
	switch(sc.nextInt()) {
	case 1:{
		System.out.println("Enter detials one by one");
		Customer cus = new Customer();
		cus.setAge(sc.nextInt());
		cus.setEmail(sc.next());
		cus.setGender(sc.next());
		cus.setName(sc.next());
		cus.setPassword(sc.next());
		cus.setPhone(sc.nextLong());
		cus = cdao.saveCustomer(cus);
		if(cus!=null) {
			System.out.println("Saved");
		}else {
			System.err.println("Error");
		}
	}break;
	
	case 2:{
		System.out.println("Enter detials one by one");
		Customer cus = new Customer();
		cus.setId(sc.nextInt());
		cus.setAge(sc.nextInt());
		cus.setEmail(sc.next());
		cus.setGender(sc.next());
		cus.setName(sc.next());
		cus.setPassword(sc.next());
		cus.setPhone(sc.nextLong());
		cus = cdao.updateCustomer(cus);
		if(cus!=null) {
			System.out.println("Updated");
		}else {
			System.err.println("Error");
		}
	}break;
	
	case 3:{
		System.out.println("Enter the id to fetch");
		Customer cus = cdao.findbyid(sc.nextInt());
		if(cus!=null) {
			System.out.println(cus);
		}else {
			System.err.println("Error");
		}
	}break;
	
	case 4:{
		System.out.println("Enter the email and pass fetch");
		Customer cus = cdao.verify(sc.next(), sc.next());
		if(cus!=null) {
			System.out.println(cus);
		}else {
			System.err.println("Error");
		}
	}break;
	
	case 5:{
		System.out.println("Enter the phone and pass to fetch");
		Customer cus = cdao.verify(sc.nextLong(), sc.next());
		if(cus!=null) {
			System.out.println(cus);
		}else {
			System.err.println("Error");
		}
	}break;
	}
}
}
