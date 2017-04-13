package com.lovo.framestudy.beans;

public class Client {
	private int id;
	private String name;
	private String address;
	private OrderForm orderForm;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(int id, String name, String address, OrderForm orderForm) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.orderForm = orderForm;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", address=" + address + ", orderForm=" + orderForm + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public OrderForm getOrderForm() {
		return orderForm;
	}
	public void setOrderForm(OrderForm orderForm) {
		this.orderForm = orderForm;
	}
	
}
