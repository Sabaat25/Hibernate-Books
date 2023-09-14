package com.jsp.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave { 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sabaat"); 
		EntityManager entityManager=entityManagerFactory.createEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction(); 
		
		Books books=new Books();  
		books.setName("It Starts with Us");
		books.setAuthorName("Colleen Hoover"); 
		books.setPrice(300); 
		
		entityTransaction.begin(); 
		entityManager.persist(books); 
		entityTransaction.commit();
	}

}
