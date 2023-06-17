package com.qspiders.hibernate.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qspiders.hibernate.dto.EmployeeInsertDTO;

public class EmployeeInsertDAO {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void openConnection() {

		factory = Persistence.createEntityManagerFactory("hibernate");
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
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}

	public static void main(String[] args) {

		try {
			openConnection();
			transaction.begin();

			EmployeeInsertDTO emp1 = new EmployeeInsertDTO();
//			emp1.setId(1);
			emp1.setName("ramesh");
			emp1.setDesignation("manager");
			emp1.setSalary(25000);

			EmployeeInsertDTO emp2 = new EmployeeInsertDTO();
//				emp1.setId(2);
			emp1.setName("suresh");
			emp1.setDesignation("manager");
			emp1.setSalary(15000);

			manager.persist(emp1);
			manager.persist(emp2);

			transaction.commit();

		} finally {

			closeConnection();
		}
	}
}
