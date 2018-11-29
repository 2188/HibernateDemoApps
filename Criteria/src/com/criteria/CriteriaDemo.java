package com.criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CriteriaDemo {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setId(8);
		emp.setFirstName("Test");
		emp.setLastName("Hibernet User");
		
		//Hibernet method to save data 
		session.save(emp);
		
		//flush a batch of inserts and release memory before adding next element
//		session.flush();
//        session.clear();
		
		t.commit();
		System.out.println("successfully saved");
		session.close();
		

	}

}
