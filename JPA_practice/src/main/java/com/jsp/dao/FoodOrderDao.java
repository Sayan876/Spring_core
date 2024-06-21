package com.jsp.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.Customer;
import com.jsp.dto.FoodOrder;

import javax.persistence.*;
import java.util.*;

@Repository
public class FoodOrderDao {
	@Autowired
 private EntityManager manager;
	
	public FoodOrder placeorder(FoodOrder fd, int id) {
		Customer cust = manager.find(Customer.class, id);
		if(cust!=null) {
			EntityTransaction transaction = manager.getTransaction();
			cust.getOrders().add(fd);
			fd.setCustomer(cust);
			transaction.begin();
			manager.persist(fd);
			transaction.commit();
			return fd;
		}return null;
	}
	
	public FoodOrder modifyorder(FoodOrder fd) {
		FoodOrder dfd = manager.find(FoodOrder.class, fd.getId());
		if(dfd!=null) {
			EntityTransaction transaction = manager.getTransaction();
			dfd.setAddress(fd.getAddress());
			dfd.setCost(fd.getCost());
			dfd.setItem(fd.getItem());
			transaction.begin();
			transaction.commit();
			return dfd;
		}return null;
	}
	
	public FoodOrder findbyid(int id) {
		return manager.find(FoodOrder.class, id);
	}
	
	public List<FoodOrder> findcid(int id) {
		Query query = manager.createQuery("select c.orders from Customer c where c.id=?1");
		query.setParameter(1, id);
		
		return query.getResultList();
	}
	
	public List<FoodOrder> findbypassandphone(long phone, String password)
	{
		Query query = manager.createQuery("select c.orders from Customer c where c.phone=?1 and c.password=?2");
		query.setParameter(1, phone);
		query.setParameter(2, password);
		
		return query.getResultList();
	}
}
