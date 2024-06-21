package com.dao;
import com.dto.*;
import java.util.*;
import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
   private EntityManager manager;
	@Transactional
	public Employee saveEmp(Employee employee, int id) {
		Department dept = manager.find(Department.class, id);
		if(dept!=null) {
			EntityTransaction transaction = manager.getTransaction();
			dept.getEmployees().add(employee);
			employee.setDepartment(dept);
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			return employee;
		    
		}else {
			return null;
		}
	}
	
	public List<Employee> findbydeptid(int id) {
		Query query = manager.createQuery("select d.employees from Department d where d.id=?1");
		query.setParameter(1, id);
		return query.getResultList();
	}
	
	public List<Employee> findbydeptName(String name){
		Query query = manager.createQuery("select d.employees from Department d where d.name=?1");
		query.setParameter(1, name);
		return query.getResultList();
	}
	
	public List<Employee> findbydesg(String design){
		Query query = manager.createQuery("select e from Employee e where e.designation=?1");
		query.setParameter(1, design);
		return query.getResultList();
	}
	
	public List<Employee> findbySalary(double salary){
		Query query = manager.createQuery("select e from Employee e where e.salary=?1");
		query.setParameter(1, salary);
		return query.getResultList();
	}
	
	public List<Employee> findbyName(String name){
		Query query = manager.createQuery("select e from Employee e where e.name=?1");
		query.setParameter(1, name);
		return query.getResultList();
	}
	
	public List<Employee> rangeSal(double sal1,double sal2){
		Query query = manager.createQuery("select e from Employee e where e.salary>=?1 and e.salary<=?2");
		query.setParameter(1, sal1);
		query.setParameter(2, sal2);
		return query.getResultList();
	}
}
