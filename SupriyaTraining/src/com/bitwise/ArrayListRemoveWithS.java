package com.bitwise;

import java.util.*;

public class ArrayListRemoveWithS {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Supriya");
		list.add("Ashwini");
		list.add("Siddharth");
		list.add("Meeraya");
		list.add("Vihaan");
		list.add("Sarthak");

		String rm = "S";
		
		System.out.println("Before :" + list);
		for (int i = 0; i <= list.size(); i++) {
			if (list.get(i).startsWith(rm.toUpperCase())) {
				list.remove(i);
			}
		}

		System.out.println("List after Removing names that begin with S :" + list);

	}

}