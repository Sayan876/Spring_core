package com.jsp.controller;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.AppConfig;
import com.jsp.dao.FoodOrderDao;
import com.jsp.dto.FoodOrder;

public class FoodController {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	FoodOrderDao fdao = context.getBean(FoodOrderDao.class);
	System.out.println("1.place Order\n2.Modify Order\n3.Find by Customer id\n4.Find by phone and password\n5.Find by id");
	Scanner sc = new Scanner(System.in);
	
	switch(sc.nextInt()) {
	case 1:{
		System.out.println("Enter detials one by one");
		int cid = sc.nextInt();
		FoodOrder fo = new FoodOrder();
		fo.setCost(sc.nextDouble());
		fo.setItem(sc.next());
		fo.setAddress(sc.next());
		
		fo = fdao.placeorder(fo, cid);
		
		if(fo!=null) {
			System.out.println("Saved");
		}else {
			System.out.println("Error");
		}
	}break;
	
	case 2:{
		System.out.println("Enter detials one by one");
		
		FoodOrder fo = new FoodOrder();
		fo.setId(sc.nextInt());
		fo.setCost(sc.nextDouble());
		fo.setItem(sc.next());
		fo.setAddress(sc.next());
		
		fo = fdao.modifyorder(fo);
		
		if(fo!=null) {
			System.out.println("Updated");
		}else {
			System.out.println("Error");
		}
	}break;
	
	case 3:{
		System.out.println("Enter the customer id");
		List<FoodOrder> fo = fdao.findcid(sc.nextInt());
		if(fo.isEmpty()) {
			System.out.println("no data");
		}else {
			for(FoodOrder f:fo) {
				System.out.println(f);
			}
		}
	}break;
	
	case 4:{
		System.out.println("Enter the phone and password");
		
		List<FoodOrder> fo = fdao.findbypassandphone(sc.nextLong(), sc.next());
		if(fo.isEmpty()) {
			System.out.println("no data");
		}else {
			for(FoodOrder f:fo) {
				System.out.println(f);
			}
		}
	}break;
	case 5:{
		System.out.println("Enter the order id");
		FoodOrder fo = fdao.findbyid(sc.nextInt());

		if(fo!=null) {
			System.out.println(fo);
		}else {
			System.out.println("Error");
		}
	}break;
	}
}
}
