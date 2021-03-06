package com.m2m_xml;

import java.util.Set;

public class Cart {

	
	private long cartId;
	private int totalPrice;
	
	private Set<Item> itemsInCart;

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Set<Item> getItemsInCart() {
		return itemsInCart;
	}

	public void setItemsInCart(Set<Item> itemsInCart) {
		this.itemsInCart = itemsInCart;
	}
}
