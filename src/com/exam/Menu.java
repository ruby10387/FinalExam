package com.exam;

public class Menu {
	int id;
	String name;
	int price;
	int calory;
	public Menu(int id, String name, int price, int calory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.calory = calory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	
}
