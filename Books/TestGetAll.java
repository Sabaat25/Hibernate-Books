package com.jsp.java;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class TestGetAll {  
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("sabaat");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	String sql="Select b From Books b"; 
	Query query=entityManager.createQuery(sql); 
	
	List<Books> books=query.getResultList(); 
	for(Books b:books) { 
		System.out.println("======================"); 
		System.out.println(b.getId()); 
		System.out.println(b.getName()); 
		System.out.println(b.getAuthorName()); 
		System.out.println(b.getPrice());  
		System.out.println("======================"); 
	} 
	} 
}
