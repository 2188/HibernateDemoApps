package com.vendor_customer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;

public class Main_Vendor_Customer_O_TO_M {

	static SessionFactory sf;
	
	public static void main(String[] args) {
		
		sf = new Configuration().configure().buildSessionFactory();
		
//		insertData();		
	
//		updateData(3);
		
//		deleteByID(0);
		
//		getDataById(4);
		
		getAllData();

	}

	private static void getAllData() {
		
		Session session = sf.openSession();
		
//		Criteria criteria = session.createCriteria(Vendor_DTO.class);
//		java.util.List vendorDTOLIst = criteria.list();
//		Iterator it = vendorDTOLIst.iterator();
//		while (it.hasNext()) {
//			Vendor_DTO vendroDTO = (Vendor_DTO) it.next();
//			System.out.println("Vendor Name = "+vendroDTO.getVendorName());
//		}
		
		Criteria criteria = session.createCriteria(Customer_POJO.class);
		java.util.List customrList = criteria.list();
		
		Iterator itr = ((java.util.List) customrList).iterator();
		
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println("Customer Name = "+ ((Customer_POJO) object).getCustName());
		}
	}

	private static void getDataById(int id) {
		
		Session session = sf.openSession();
		
		Vendor_DTO  vendorObj = (Vendor_DTO) session.load(Vendor_DTO.class, id);
		
		System.out.println("----------  "+vendorObj.getVendorName());
		
	}

	private static void deleteByID(int id) {
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Vendor_DTO  vendorObj = (Vendor_DTO) session.load(Vendor_DTO.class, id);
		session.delete(vendorObj);
		
		// delete via transient instance   // works well, no issue for child table
//		Customer_POJO cus = new Customer_POJO();
//		cus.setCustomerID(id);
//		session.delete(cus);

		// delete via transient instance   // do not worked, ConstraintViolationException when remove from parent table
//		Vendor_DTO vendor = new Vendor_DTO();
//		vendor.setVendorID(id);
//		session.delete(vendor);
		
		session.getTransaction().commit();
		
		session.close();
		
	}

	private static void insertData() {
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Vendor_DTO vtDTO = new Vendor_DTO();
//		vtDTO.setVendorID(5);
		vtDTO.setVendorName("Jio");
		
		Customer_POJO cusPojo = new Customer_POJO();
//		cusPojo.setCustomerID(13);
		cusPojo.setCustName("BCD");

//		Customer_POJO cusPojo1 = new Customer_POJO();
//		cusPojo1.setCustomerID(14);
//		cusPojo1.setCustName("YZA");
		
		Set set = new HashSet<>();
		set.add(cusPojo);
//		set.add(cusPojo1);
		
		vtDTO.setCustomers(set);
		
		session.save(vtDTO);
		
		session.getTransaction().commit();
		
		session.close();
	}

	
	private static void updateData(int vendorID_N_customerID) {
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Vendor_DTO vtDTO = new Vendor_DTO();
		vtDTO.setVendorID(vendorID_N_customerID);
		vtDTO.setVendorName("Jio");
		
		Customer_POJO cusPojo = new Customer_POJO();
		cusPojo.setCustomerID(7);
		cusPojo.setCustName("BCD");

		Customer_POJO cusPojo1 = new Customer_POJO();
		cusPojo1.setCustomerID(10);
		cusPojo1.setCustName("YZA");
		
		Set set = new HashSet<>();
		set.add(cusPojo);
		set.add(cusPojo1);
		
		vtDTO.setCustomers(set);
		
		session.update(vtDTO);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
