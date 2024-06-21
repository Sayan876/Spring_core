package com.control;
import java.util.*;
import javax.persistence.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.*;
import com.CustomerConfig;
import com.dao.*;
public class CustomerControll {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
	CustomerDao cdao = context.getBean(CustomerDao.class);
	System.out.println("1.Save Customer\n2.Update Customer\n3.Find Customer by id");
	Scanner sc = new Scanner(System.in);
	
	switch(sc.nextInt()) {
	case 1:{
		System.out.println("Enter the details to create a new customer");
		Customer cus = new Customer();
		cus.setName(sc.next());
		cus.setAge(sc.nextInt());
		cus.setEmail(sc.next());
		cus.setGender(sc.next());
		cus.setPassword(sc.next());
		cus.setPhoneno(sc.nextLong());
		
		cus = cdao.saveCustomer(cus);
		if(cus!=null) {
			System.out.println("Customer saved with "+cus.getId());
		}else {
			System.out.println("According to me something's wrong");
		}
	}break;
	
	case 2:{
		System.out.println("Enter the details to create a new customer");
		Customer cus = new Customer();
		cus.setId(sc.nextInt());
		cus.setName(sc.next());
		cus.setAge(sc.nextInt());
		cus.setEmail(sc.next());
		cus.setGender(sc.next());
		cus.setPassword(sc.next());
		cus.setPhoneno(sc.nextLong());
		
		cus = cdao.updateCustomer(cus);
		if(cus!=null) {
			System.out.println("customer updated");
		}else {
			System.out.println("According to me something's wrong");
		}
	}break;
	
	case 3:{
		
		System.out.println("Enter the id to get ahold of the customer");
		int id = sc.nextInt();
		Customer cus = cdao.findbyId(id);
		if(cus!=null) {
			System.out.println(cus);
			
		}else {
			System.out.println("According to me something's wrong");
		}
	}break;
	
	case 4:{
		System.out.println("Enter the phoneno and password to verify the user");
		long phone = sc.nextLong();
		String pass = sc.next();
		Customer cus = cdao.verifybyphoneandPass(phone, pass);
		
			if(cus!=null) {
				System.out.println(cus);
				
			}else {
				System.out.println("According to me something's wrong");
			}
	}break;
	}
}
}
