package com.mindtree.shoppingcart.dto;

import com.mindtree.shoppingcart.entity.Product;

public class CartProductDto {
	
	private Product product;
	private int quantity;
	public CartProductDto() {
		super();
	}
	public CartProductDto(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "GetCartDto [product=" + product + ", quantity=" + quantity + "]";
	}
	
	
	
}
