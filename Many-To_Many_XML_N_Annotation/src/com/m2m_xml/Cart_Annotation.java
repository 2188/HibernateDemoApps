package com.m2m_xml;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cart_Annotation")
public class Cart_Annotation {

	@Id
	@Column(name = "Cart_Id")
	private long cartId;

	@Column(name = "Total_Item_Price")
	private int totalPrice;

	@ManyToMany(targetEntity = Item_Annotation.class, cascade = CascadeType.ALL)
	@JoinTable(name = "Cart_Item_Annotation", joinColumns = { @JoinColumn(name = "Cart_Id") }, inverseJoinColumns = {
			@JoinColumn(name = "Item_Id") })
	private Set<Item_Annotation> itemsInCart;

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

	public Set<Item_Annotation> getItemsInCart() {
		return itemsInCart;
	}

	public void setItemsInCart(Set<Item_Annotation> itemsInCart) {
		this.itemsInCart = itemsInCart;
	}
}
