package com.control;
import java.util.*;
import javax.persistence.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.*;
import com.OfficeConfig;
import com.dao.*;
public class DepartmentControl {
  public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(OfficeConfig.class);
	DepartmentDao dDao = context.getBean(DepartmentDao.class);
	System.out.println("1.Save Department\n2.Update the existing Department");
	
	Scanner sc = new Scanner(System.in);
	
	switch(sc.nextInt()) {
	case 1:{
		System.out.println("Start entering details to create a new department");
		Department d = new Department();
		d.setName(sc.next());
		d.setLocation(sc.next());
		
		d = dDao.saveDept(d);
		if(d!=null) {
			System.out.println("Department saved under the name of "+d.getName());
		}else {
			System.err.println("An unknown error has been occured");
		}
	}break;
	
	case 2:{
		System.out.println("Start entering details to update the existing department");
		Department d = new Department();
		d.setId(sc.nextInt());
		d.setName(sc.next());
		d.setLocation(sc.next());
		
		d = dDao.updateDept(d);
		if(d!=null) {
			System.out.println("Updated");
		}else {
			System.err.println("An unknown error has been occured");
		}
	}break;
	}
	
}
}
