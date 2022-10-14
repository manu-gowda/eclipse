package com.xworkz.copy.boot;

public class BreadRunner {

	public static void main(String[] args) {
		Bread bread = new Bread();
		System.out.println(bread.shape);
		System.out.println(bread.type);
		System.out.println(bread.companyName);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		
		bread.shape="square";
		bread.companyName ="bread";
		bread.price=20;
		bread.quantity=true;
		bread.type="box";
		
		System.out.println(bread.quantity);
		System.out.println(bread.type);
		System.out.println(bread.companyName);
		System.out.println(bread.price);
		System.out.println(bread.type);

	}

}
