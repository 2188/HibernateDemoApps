package com.m2m_xml;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main_Many2Many {

	public static SessionFactory sf;
	
	public static void main(String[] args) {
		
		sf = new Configuration().configure().buildSessionFactory();
		
//		insertDataWith_XML();		//***************** XML based saving

		inserDataWith_Annotation();		//***************** Annotation based saving 
	}
	
	//***************** Annotation based saving
	private static void inserDataWith_Annotation() {

		Session session = sf.openSession();
		
		Item_Annotation item = new Item_Annotation();
		item.setItemId(7);
		item.setItemDes("SHIRT");
		item.setPrice(500);
		
		Item_Annotation item1 = new Item_Annotation();
		item1.setItemId(8);
		item1.setItemDes("jEANS");
		item1.setPrice(700);
		
		Set<Item_Annotation> itemData = new HashSet<Item_Annotation>();
		itemData.add(item);
		itemData.add(item1);
		
		Cart_Annotation cart = new Cart_Annotation();
		cart.setCartId(7);
		cart.setTotalPrice(1200);
		cart.setItemsInCart(itemData);
		
		Set<Item_Annotation> itemData1 = new HashSet<Item_Annotation>();
		itemData1.add(item1);
		
		Cart_Annotation cart1 = new Cart_Annotation();
		cart1.setCartId(8);
		cart1.setTotalPrice(700);
		cart1.setItemsInCart(itemData1);
		
		session.save(cart);
		session.save(cart1);
		
		session.beginTransaction().commit();
		
		session.close();
	}

	//***************** XML based saving *********
	private static void insertDataWith_XML () {
		
		Session session = sf.openSession();
		
		Item item = new Item();
//		item.setItemId(1);
		item.setItemDes("Vegitables");
		item.setPrice(300);
		
		Item item1 = new Item();
//		item1.setItemId(2);
		item1.setItemDes("Sweets");
		item1.setPrice(200);
		
		Set<Item> itemData = new HashSet<Item>();
		itemData.add(item);
		itemData.add(item1);
		
		Cart cart = new Cart();
//		cart.setCartId(1);
		cart.setTotalPrice(500);
		cart.setItemsInCart(itemData);
		
		Set<Item> itemData1 = new HashSet<Item>();
		itemData1.add(item1);
		
		Cart cart1 = new Cart();
//		cart1.setCartId(2);
		cart1.setTotalPrice(200);
		cart1.setItemsInCart(itemData1);
		
		session.save(cart);
		session.save(cart1);
		
		session.beginTransaction().commit();
		
		session.close();
	}

}
