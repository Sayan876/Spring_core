package com.dao;

import com.dto.*;
import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DepartmentDao {
	@Autowired
	private EntityManager manager;

	@Transactional
	public Department saveDept(Department department) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(department);
		transaction.commit();
		return department;
	}

	public Department updateDept(Department department) {
		Department dbdept = manager.find(Department.class, department.getId());
		if (dbdept != null) {
			EntityTransaction transaction = manager.getTransaction();
			dbdept.setName(department.getName());
			dbdept.setLocation(department.getLocation());
			transaction.begin();
			transaction.commit();
			return dbdept;

		} else {
			return null;
		}
	}
}
