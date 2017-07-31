package com.bitwise;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		String PersonName;

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ramesh");
		list.add("Suresh");
		list.add("Jayesh");
		list.add("Lokesh");
		list.add("Priyesh");

		Scanner pn = new Scanner(System.in);
		System.out.println("please enter person's name for search");
		PersonName = pn.next();
		
		if (list.contains(PersonName)) {
				System.out.println("Person found in arraylist");
			}
		else
		{
			System.out.println("Could not find person in ArrayList");
		}
	}
}
