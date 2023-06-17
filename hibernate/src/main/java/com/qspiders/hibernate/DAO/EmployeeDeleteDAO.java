package com.qspiders.hibernate.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qspiders.hibernate.dto.EmployeeInsertDTO;

public class EmployeeDeleteDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openConnection() {

		factory = Persistence.createEntityManagerFactory("hibernate");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

	}

	public static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}

	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			EmployeeInsertDTO emp = manager.find(EmployeeInsertDTO.class,2);
			manager.remove(emp);
			
			
			transaction.commit();
		} finally {
			closeConnection();
		}
	}
}
