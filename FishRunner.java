package com.xworkz.copy.boot;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish Fish = new Fish();
		System.out.println(Fish.name);
		System.out.println(Fish.type);
		System.out.println(Fish.price);
		System.out.println(Fish.weight);
		System.out.println(Fish.length);
		
		Fish.name="Fish";
		Fish.type="super";
		Fish.price =20;
		Fish.weight=3;
		Fish.length=1f;
		
		System.out.println(Fish.name);
		System.out.println(Fish.type);
		System.out.println(Fish.price);
		System.out.println(Fish.weight);
		System.out.println(Fish.length);
		
		}
}
