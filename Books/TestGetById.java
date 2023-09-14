package com.jsp.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {  
	public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sabaat"); 
	EntityManager entityManager= entityManagerFactory.createEntityManager(); 
	
	Books books=entityManager.find(Books.class,2);
	System.out.println(books.getId()); 
	System.out.println(books.getName()); 
	System.out.println(books.getAuthorName()); 
	System.out.println(books.getPrice());  
	}

}
