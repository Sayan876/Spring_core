package com.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import java.util.*;
import com.dto.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.*;
@Repository
public class CustomerDao {
	 @Autowired
     private EntityManager entityManager;
	 @Transactional
	 public Customer saveCustomer(Customer customer) {
		 EntityTransaction transaction = entityManager.getTransaction();
		 entityManager.persist(customer);
		 transaction.begin();
		 transaction.commit();
		 return customer;
	 }
	 
	 public Customer updateCustomer(Customer customer) {
		 EntityTransaction transaction = entityManager.getTransaction();
		 Customer dbcustomer = entityManager.find(Customer.class, customer.getId());
		 if(dbcustomer!=null) {
			 dbcustomer.setAge(customer.getAge());
			 dbcustomer.setEmail(customer.getEmail());
			 dbcustomer.setGender(customer.getGender());
			 dbcustomer.setName(customer.getName());
			 dbcustomer.setPassword(customer.getPassword());
			 dbcustomer.setPhoneno(customer.getPhoneno());
			 transaction.begin();
			 transaction.commit();
			 return dbcustomer;
			 
		 }
		 return null;
		 
	 }
	 
	 public Customer verifybyphoneandPass(long phone, String password) {
		 Query query = entityManager.createQuery("select c from Customer c where c.phoneno=?1 and c.password=?2");
		 query.setParameter(1, phone);
		 query.setParameter(2, password);
		 try {
			 return (Customer) query.getSingleResult();
		 }catch(NoResultException e) {
			 return null;
		 }
		 
		 
	 }
	 
	 public Customer verifybyemailandpass(String email, String password) {
		 Query query = entityManager.createQuery("select c from Customer c where c.email=?1 and c.password=?2");
		 query.setParameter(1, email);
		 query.setParameter(2, password);
		 
		 try {
			 return (Customer) query.getSingleResult();
		 }catch(NoResultException e) {
			 return null;
		 }
		 
	 }
	 
	 public Customer findbyId(int id) {
		 return entityManager.find(Customer.class,id);
	 }
	 
	 
	
}
