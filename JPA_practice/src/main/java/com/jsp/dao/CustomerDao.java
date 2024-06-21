package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.dto.Customer;

@Repository
public class CustomerDao {
	@Autowired
	private EntityManager manager;

	@Transactional
	public Customer saveCustomer(Customer customer) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
		return customer;
	}

	public Customer updateCustomer(Customer customer) {
		Customer cust = manager.find(Customer.class, customer.getId());
		if (cust != null) {
			EntityTransaction transaction = manager.getTransaction();
			cust.setAge(customer.getAge());
			cust.setEmail(customer.getEmail());
			cust.setGender(customer.getGender());
			cust.setName(customer.getName());
			cust.setPassword(customer.getPassword());
			cust.setPhone(customer.getPhone());
			transaction.begin();
			transaction.commit();
			return cust;
		}
		return null;
	}

	public Customer findbyid(int id) {
		return manager.find(Customer.class, id);
	}

	public Customer verify(String email, String password) {
		Query query = manager.createQuery("select c from Customer c where c.email=?1 and c.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		try {
			return (Customer) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	public Customer verify(long phone, String password) {
		Query query = manager.createQuery("select c from Customer c where c.phone=?1 and c.password=?2");
		query.setParameter(1, phone);
		query.setParameter(2, password);
		try {
			return (Customer) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
