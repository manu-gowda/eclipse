package com.xworkz.copy.boot;

public class Bread {
	public String shape;
	public String type;
	public int price;
	public boolean quantity;
	public String companyName;
	
	
	public Bread() {
		System.out.println("enterd the bread name");
	}
	public Bread(String shape)
	{
		this.shape=shape;
		System.out.println("================================");
	}
	public Bread(String type,int price)
	{
		this.type=type;
		this.price=price;
		System.out.println("================================ ");
	}
	public Bread (int price)
	{
		this.price=price;
		System.out.println("================================");
		
	}
	public Bread (boolean quantity,int price) {
		this.quantity=quantity;
		System.out.println("-----------------------------");
		
	}
	public Bread(String type,boolean quantity) {
		this.quantity=quantity;
		System.out.println("-----------------------------");
		
		
	}
	public Bread(boolean quantity,int price,String type) {
		this.quantity=quantity;
		this.price=price;
		System.out.println("-----------------------------");
	}
	public Bread(String companyName,int price,boolean quantity) {
		this.companyName=companyName;
		this.price=price;
		System.out.println("-----------------------------");
	}

}
