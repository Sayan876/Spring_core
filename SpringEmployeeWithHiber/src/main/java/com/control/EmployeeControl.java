package com.control;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.*;
import com.OfficeConfig;
import com.dao.*;
import java.util.*;
public class EmployeeControl {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(OfficeConfig.class);
	EmployeeDao eDao = context.getBean(EmployeeDao.class);
	System.out.println("1.Save Employee\n2.Find employees by department id\n3.Find employees by department name\n4.Find employees by designation\n5.Find employees by salary\n6.Find employees by name\n7.Find employees between a salary range");
	Scanner sc = new Scanner(System.in);
	
	switch(sc.nextInt()) {
	case 1:{
		System.out.println("Enter the department id to add employee");
		int id = sc.nextInt();
		Employee emp = new Employee();
		System.out.println("Enter the designation");
		emp.setDesignation(sc.next());
		System.out.println("Enter the name");
		emp.setName(sc.next());
		System.out.println("Set a nice password");
		emp.setPassword(sc.next());
		System.out.println("Enter a unique phone number");
		emp.setPhone(sc.nextLong());
		System.out.println("What's the wage?");
		emp.setSalary(sc.nextDouble());
		
		emp = eDao.saveEmp(emp, id);
		if(emp!=null) {
			System.out.println("Employee saved with id no "+emp.getId());
		}else {
			System.err.println("An unknown error has been occured");
		}
	}break;
	
	case 2:{
		System.out.println("Enter the department id");
		List<Employee> d = eDao.findbydeptid(sc.nextInt());
		if(d.isEmpty()) {
			System.err.println("No data");
		}else {
			for(Employee l:d) {
				System.out.println(l);
			}
		}
	}break;
	
	case 3:{
		System.out.println("Enter the department name");
		List<Employee> d = eDao.findbydeptName(sc.next());
		if(d.isEmpty()) {
			System.err.println("No data");
		}else {
			for(Employee l:d) {
				System.out.println(l);
			}
		}
	}break;
	
	case 4:{
		System.out.println("Enter the designation");
		List<Employee> d = eDao.findbydesg(sc.next());
		if(d.isEmpty()) {
			System.err.println("No data");
		}else {
			for(Employee l:d) {
				System.out.println(l);
			}
		}
	}break;
	
	case 5:{
		System.out.println("Enter the salary");
		List<Employee> d = eDao.findbySalary(sc.nextDouble());
		if(d.isEmpty()) {
			System.err.println("No data");
		}else {
			for(Employee l:d) {
				System.out.println(l);
			}
		}
	}break;
	case 6:{
		System.out.println("Enter the designation");
		List<Employee> d = eDao.findbyName(sc.next());
		if(d.isEmpty()) {
			System.err.println("No data");
		}else {
			for(Employee l:d) {
				System.out.println(l);
			}
		}
	}break;
	case 7:{
		System.out.println("set the min and max range of the salary");
		System.out.println("Enter the minimum range");
		double min = sc.nextDouble();
		System.out.println("Enter the maximum range");
		double max = sc.nextDouble();
		List<Employee> emp = eDao.rangeSal(min, max);
		if(emp.isEmpty()) {
			System.err.println("No data found");
		}else {
			for(Employee e:emp) {
				System.out.println(e);
			}
		}
	}break;
	}
  }
}
