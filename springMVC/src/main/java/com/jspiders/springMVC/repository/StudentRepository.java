package com.jspiders.springMVC.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jspiders.springMVC.pojo.StudentPOJO;

@Repository
public class StudentRepository {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("mvc");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
	}

	public StudentPOJO addStudent(String name, String email,
			long mobile, String address) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = new StudentPOJO();
		pojo.setName(name);
		pojo.setEmail(email);
		pojo.setMobile(mobile);
		pojo.setAddress(address);
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		return pojo;
	}
	
	public StudentPOJO searchStudent(int id) {
		openConnection();
		transaction.begin();
		StudentPOJO pojo = manager.find(StudentPOJO.class, id);
		if (pojo != null) {
			transaction.commit();
			closeConnection();
			return pojo;
		}
		transaction.commit();
		closeConnection();
		return null;
	}
	

}
