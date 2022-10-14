package com.xworkz.copy.boot;

public class Fish {
	public String name;
	public String type;
	public int price;
	public double weight;
	public float length;
	
	
	public Fish() {
		System.out.println("enterd the fish name");
	}
	public Fish(String name)
	{
		this.name=name;
		System.out.println("================================");
	}
	public Fish(String type,int price)
	{
		this.type=type;
		this.price=price;
		System.out.println("================================ ");
	}
	public Fish (int price)
	{
		this.price=price;
		System.out.println("================================");
		
	}
	public Fish (double weight) {
		this.weight=weight;
		System.out.println("-----------------------------");
		
	}
	public Fish(float length) {
		this.length=length;
		System.out.println("-----------------------------");
		
		
	}
	public Fish(float length,int price) {
		this.length=length;
		this.price=price;
		System.out.println("-----------------------------");
	}
	public Fish(float length,int price,double weight) {
		this.length=length;
		this.price=price;
		System.out.println("-----------------------------");
	}
	
}
