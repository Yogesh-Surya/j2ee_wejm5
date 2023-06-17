package com.qspiders.hibernate.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.qspiders.hibernate.dto.StudentDTO;

public class StudentDAO {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		StudentDTO student1 = new StudentDTO();
		student1.setId(3);
		student1.setSname("raakesh");
		student1.setSemail("rakesh@mail");
		student1.setSmarks(50);
		student1.setSaddress("pune");

		entityManager.persist(student1);
		entityTransaction.commit();

		if (entityManagerFactory != null) {
				entityManager.clear();
		}
		if (entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
	}

}
	