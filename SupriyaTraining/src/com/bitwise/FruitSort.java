package com.bitwise;

import java.util.ArrayList;
import java.util.Collections;

public class FruitSort {

	public static void main(String[] args) {
		
		ArrayList <String> Fruits = new ArrayList <String> ();
		
		Fruits.add("Banana");
		Fruits.add("Mango");
		Fruits.add("Kiwi");
		Fruits.add("Strawberry");
		Fruits.add("Apple");
		Fruits.add("Jackfruit");
		Fruits.add("Pineapple");
		Fruits.add("Grapes");
		Fruits.add("Orange");
		Fruits.add("Cherry");
		
		
		System.out.println("Before Sorting : " + Fruits);
		
		Collections.sort(Fruits);
		
		System.out.println("After Sorting :" + Fruits);
	}

}
