package com.lovo.framestudy.beans;

public class OrderForm {
	private int id;
	private String ofname;
	private Client client;
	
	public OrderForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrderForm(int id, String ofname, Client client) {
		super();
		this.id = id;
		this.ofname = ofname;
		this.client = client;
	}
	
	@Override
	public String toString() {
		return "OrderForm [id=" + id + ", ofname=" + ofname + ", client=" + client + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOfname() {
		return ofname;
	}
	public void setOfname(String ofname) {
		this.ofname = ofname;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
}
