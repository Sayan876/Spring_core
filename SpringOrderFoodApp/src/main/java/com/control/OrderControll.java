package com.control;
import javax.persistence.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

import com.CustomerConfig;
import com.dao.*;
import com.dto.*;
public class OrderControll {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
	FoodOrderDao fdao = context.getBean(FoodOrderDao.class);
	System.out.println("1.Save Order\n2.Update Order\n3.Fetch Order by id\n4.Fetch Order by Customer's Id\n5.Fetch Order by customer's email and password");
	
	Scanner sc = new Scanner(System.in);
	
	switch(sc.nextInt()) {
	case 1:{
		System.out.println("Add details one by one");
		FoodOrder fo = new FoodOrder();
		System.out.println("Ok! Enter the customer's id first..");
		int id = sc.nextInt();
		fo.setFood_item(sc.next());
		fo.setCost(sc.nextDouble());
		fo.setAddress(sc.next());
		fo = fdao.saveOrder(fo, id);
		if(fo!=null) {
			System.out.println("Order saved");
		}else {
			System.err.println("Something's wrong");
		}
	}break;
	
	case 2:{
		System.out.println("Enter the new detials to update an Order");
		FoodOrder fo = new FoodOrder();
		fo.setId(sc.nextInt());
		fo.setAddress(sc.next());
		fo.setFood_item(sc.next());
		fo.setCost(sc.nextDouble());
		
		fo = fdao.updateOrder(fo);
		if(fo!=null) {
			System.out.println("Updated");
		}else {
			System.err.println("Error while updating the Order details");
		}
	}break;
	
	case 3:{
		System.out.println("Enter the order id");
		FoodOrder fo = fdao.FindbyId(sc.nextInt());
		if(fo!=null) {
			System.out.println(fo);
		}else {
			System.err.println("Error");
		}
	}break;
	
	case 4:{
		System.out.println("Enter the customer id");
		List<FoodOrder> fo = fdao.findbycustid(sc.nextInt());
		if(fo.isEmpty()) {
			System.err.println("List is empty");
		}else {
			for(FoodOrder f:fo) {
				System.out.println(f);
			}
		}
	}break;
	
	case 5:{
		System.out.println("Enter the email and password to see the orders");
		String email = sc.next();
		String password = sc.next();
		List<FoodOrder> fo = fdao.verifyOrder(email,password);
		if(fo.isEmpty()) {
			System.err.println("List is empty");
		}else {
			for(FoodOrder f:fo) {
				System.out.println(f);
			}
	}break;
	}
	
	
}
}
}
