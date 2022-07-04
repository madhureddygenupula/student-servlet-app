package com.ty.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.student.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveStudent(Student student)
	{
		entityTransaction.begin();
		
		entityManager.persist(student);
		
		entityTransaction.commit();
	}
}
