package com.namedquery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.namedquery.UserDTO;

public class Test_Example_Named_Query {

	public static void main(String[] args) {
		
		SessionFactory	sf = new Configuration().configure().buildSessionFactory();
		
		//************ First Named query ************
		
		Session session2 = sf.openSession();
		
		
		
		
	}

}
