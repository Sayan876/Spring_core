package com.dao;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.dto.*;

@Repository
public class FoodOrderDao {
	@Autowired
  private EntityManager entityManager;
	public FoodOrder saveOrder(FoodOrder foodOrder, int id) {
		Customer custo = entityManager.find(Customer.class, id);
		if(custo!=null) {
			EntityTransaction transaction = entityManager.getTransaction();
			custo.getOrders().add(foodOrder);
			foodOrder.setCustomer(custo);
			transaction.begin();
			entityManager.persist(foodOrder);
			transaction.commit();
			return foodOrder;
		}else {
			return null;
		}
	}
	
	public FoodOrder updateOrder(FoodOrder foodorder) {
		FoodOrder order = entityManager.find(FoodOrder.class, foodorder.getId());
		if(order!=null) {
			EntityTransaction transaction = entityManager.getTransaction();
			order.setAddress(foodorder.getAddress());
			order.setFood_item(foodorder.getFood_item());
			order.setCost(foodorder.getCost());
			transaction.begin();
			transaction.commit();
			return order;
		}else {
			return null;
		}
	}
	
	public FoodOrder FindbyId(int id) {
		 Query query = entityManager.createQuery("select f from FoodOrder f where f.id=?1");
		 query.setParameter(1,id);
		 return (FoodOrder) query.getSingleResult();
	 }
	
	public List<FoodOrder> findbycustid(int id){
		Query query = entityManager.createQuery("select c.orders from Customer c where c.id=?1");
		query.setParameter(1, id);
		return query.getResultList();
	}
	
	 public List<FoodOrder> verifyOrder(String email, String password) {
		 Query query = entityManager.createQuery("select c.orders from Customer c where c.email=?1 and c.password=?2");
		 query.setParameter(1, email);
		 query.setParameter(2, password);
		 return query.getResultList();
	 }
}
