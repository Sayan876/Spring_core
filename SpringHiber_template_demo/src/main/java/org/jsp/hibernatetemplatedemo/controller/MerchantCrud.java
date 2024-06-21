package org.jsp.hibernatetemplatedemo.controller;

import org.jsp.hibernatetemplatedemo.dao.MerchantDao;
import org.jsp.hibernatetemplatedemo.dto.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class MerchantCrud {
  public static void main(String[] args) {
	  
	  //hibernateCore
	  //Springcontext
	  //mysqlconnector
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	MerchantDao mdao = context.getBean(MerchantDao.class);
	System.out.println("1.Save a Merchant\n2.Update the Merchant\n.3Find by Id");
	Scanner sc = new Scanner(System.in);
	
	switch(sc.nextInt()) {
	
	
	case 1: {
		System.out.println("Enter the details of the Merchant");
		Merchant mer = new Merchant();
		mer.setName(sc.next());
		mer.setEmail(sc.next());
		mer.setPhoneno(sc.nextLong());
		mer.setGstNumber(sc.next());
		mer.setPassword(sc.next());
		
		mer = mdao.saveMerchant(mer);
		System.out.println("Merchant saved with id "+mer.getId());
	}break;
	
	case 2:{
		
		System.out.println("Enter the new details");
		Merchant mer = new Merchant();
		mer.setId(sc.nextInt());
		mer.setName(sc.next());
		mer.setEmail(sc.next());
		mer.setGstNumber(sc.next());
		mer.setPassword(sc.next());
		mer.setPhoneno(sc.nextLong());
		
		mer = mdao.updateMerchant(mer);
		System.out.println("merchant updated");
		
	}break;
	
	case 3:{
		System.out.println("Enter the id to fetch");
		Merchant mer = new Merchant();
		
		mer = mdao.findbyId(sc.nextInt());
		if(mer!=null) {
			System.out.println(mer);
		}else {
			System.out.println("Error");
		}
		
	}break;
	
	case 4:{
		System.out.println("Enter an id to delete the particular record you want");
		Merchant mer = new Merchant();
		mer = mdao.deleteMer(sc.nextInt());
		if(mer!=null) {
			System.out.println("Merchant deleted");
		}else {
			System.out.println("something is wrong");
		}
		}break;
	}
	
	
}
}
