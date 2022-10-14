package com.xworkz.copy.boot;

public class BoatRunner {

	public static void main(String[] args) {
		Boat Boat = new Boat();
		System.out.println(Boat.name);
		System.out.println(Boat.type);
		System.out.println(Boat.companyName);
		System.out.println(Boat.color);
		System.out.println(Boat.owner);
		
		Boat.name="bluetooth";
		Boat.companyName ="Boat";
		Boat.color="black";
		Boat.owner="coffeeNaduManu";
		
		System.out.println(Boat.name);
		System.out.println(Boat.type);
		System.out.println(Boat.companyName);
		System.out.println(Boat.color);
	
		
	

	}

}
