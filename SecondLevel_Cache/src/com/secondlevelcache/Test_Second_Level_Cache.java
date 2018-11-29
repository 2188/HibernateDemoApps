package com.secondlevelcache;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Test_Second_Level_Cache {

	static SessionFactory sf;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		sf = new Configuration().configure().buildSessionFactory();
		
		//************ Test 1 Second level cache ************
		
		System.out.println("abstraction layerabstraction layer   DB call Start = "+System.currentTimeMillis());
		Session session2 = sf.openSession();
		UserDTO userDTO1 = (UserDTO) session2.load(UserDTO.class, 6);
		System.out.println("User Detail : - "+userDTO1.getFirstname()+", Last name = "+userDTO1.getLastname()+", City = "+userDTO1.getCity());
		session2.close();
		System.out.println("abstraction layerabstraction layer   DB call Start = "+System.currentTimeMillis());
		
		System.out.println("abstraction layerabstraction layer   Cache call Start = "+System.currentTimeMillis());
		Session session3 = sf.openSession();
		UserDTO userDTO2 = (UserDTO) session3.load(UserDTO.class, 6);
		System.out.println("User Detail : - "+userDTO2.getFirstname()+", Last name = "+userDTO2.getLastname()+", City = "+userDTO2.getCity());
		session3.close();
		System.out.println("abstraction layerabstraction layer   DB call Start = "+System.currentTimeMillis());
		//************ Test 1 Second level cache ************
		
		
		//************ Test 2 Second level cache ************
//		for (int i = 0; i < 10; i++) {
//			Session session3 = sf.openSession();
//			UserDTO userDTO2 = (UserDTO) session3.load(UserDTO.class, i);
//			System.out.println("User Detail : - "+userDTO2.getFirstname()+", Last name = "+userDTO2.getLastname()+", City = "+userDTO2.getCity());
//			session3.close();
//			
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println("\nUser Detail from cache ********************\n");
//		
//		for (int i = 0; i < 10; i++) {
//			Session session3 = sf.openSession();
//			UserDTO userDTO2 = (UserDTO) session3.load(UserDTO.class, i);
//			System.out.println("User Detail : - "+userDTO2.getFirstname()+", Last name = "+userDTO2.getLastname()+", City = "+userDTO2.getCity());
//			session3.close();
//			
//			if (i == 3)
//				updateDataToDB(4, "Test T44", "T44 User", "Ahemdabad", "testt44@foo.com", "testt44123", 55);
//			if (i == 6)
//				updateDataToDB(7, "Test T77", "T77 User", "Kerala", "testt77@foo.com", "testt77123", 77);
//			
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		//************ Test 2 Second level cache ************
	}

	private static void updateDataToDB(int id, String fName, String lName, String city, String email, String password, int age) {
		
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
		System.out.println("Record Inserted "+dto.getFirstname());
		session.close();
	}

	
}
