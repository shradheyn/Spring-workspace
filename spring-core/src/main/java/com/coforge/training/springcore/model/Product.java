package com.coforge.training.springcore.model;
/**
* Author   : Shradhey.Naudiyal
* Date     : Sep 27, 2025
* Time     : 10:22:19 AM
* Project  : spring-core
*/
public class Product {
	private String name;
	private double price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
