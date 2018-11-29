package com.many2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.cache.config.Configuration;

public class Main_M_to_O {

	static SessionFactory sf;

	public static void main(String[] args) {

		sf = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();

// 		insertData();
		
//		updateData(5);
		
		deleteDataById(6);

	}

	private static void deleteDataById(int id) {
		
		Session session = sf.openSession();
		
		Vendor_DTO cust = (Vendor_DTO) session.load(Vendor_DTO.class, id);
	
//		Customer_DTO cust = new Customer_DTO();
//		cust.setC_id(id);
		
		session.delete(cust);
		
		session.beginTransaction().commit();
		
		session.close();
		
	}

	private static void updateData(int id) {

		Session session = sf.openSession();

		Vendor_DTO vendor = new Vendor_DTO();
		vendor.setVendorID(5);
		vendor.setVendorName("DOCOMO");

		Customer_DTO customerDTO = new Customer_DTO();
		customerDTO.setC_id(id);
		customerDTO.setC_name("BBC");
		customerDTO.setVendor(vendor);

		session.update(customerDTO);

		session.beginTransaction().commit();

		session.close();

	}

	private static void insertData() {

		Session session = sf.openSession();

		Vendor_DTO vendor = new Vendor_DTO();
		vendor.setVendorID(5);
		vendor.setVendorName("Vodafone");

		Customer_DTO customerDTO = new Customer_DTO();
		customerDTO.setC_id(12);
		customerDTO.setC_name("BBC");
		customerDTO.setVendor(vendor);

		session.save(customerDTO);

		session.beginTransaction().commit();

		session.close();

	}

}
