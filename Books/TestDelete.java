package com.jsp.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete { 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sabaat"); 
		EntityManager entityManager= entityManagerFactory.createEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction(); 
		
		Car car=entityManager.find(Books.class, 1); 
		
		if(car!=null) { 
			entityTransaction.begin(); 
			entityManager.remove(books); 
			entityTransaction.commit();
		}else { 
			System.out.println("NoT DeleTed");
		}
	}
}
