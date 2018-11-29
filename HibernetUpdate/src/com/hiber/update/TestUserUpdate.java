package com.hiber.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.update.UserDTO;

public class TestUserUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		updateDataToDB(5, "Test T2", "T2 User", "Ahemdabad", "testt2@foo.com", "testt2123", 55);
	}

private static void updateDataToDB(int id, String fName, String lName, String city, String email, String password, int age) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		UserDTO dto=new UserDTO();
		
		dto.setId(id);
		dto.setFirstname(fName);
		dto.setLastname(lName);
		dto.setCity(city);
		dto.setEmail(email);
		dto.setPassword(password);
		dto.setAge(age);
		
		session.update(dto);
		
		t.commit();
		System.out.println("Record Updated "+dto.getFirstname());
		session.close();
	}
	
}
