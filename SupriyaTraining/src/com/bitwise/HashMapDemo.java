package com.bitwise;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map <Integer,String> student = new HashMap <Integer,String> ();
		student.put(1, "Ranveer");
		student.put(2, "Deepika");
		student.put(3, "Anushka");
		student.put(4, "Ranbir");
		student.put(5, "Katrina");
		student.put(6, "Kareena");
		student.put(7, "Priyanka");
		student.put(8, "Akshay");
		student.put(9, "Patineeti");
		student.put(10, "Aamir");
		
		display(student,5,8);
		
	}
	
	
private static void display(Map<Integer, String> student,int from,int to) {
	Iterator<Entry<Integer, String>> itr = student.entrySet().iterator();
	
    while (itr.hasNext()) {
        Map.Entry<Integer,String> pair = (Entry<Integer, String>)itr.next();
        if(pair.getKey().intValue()>=from && pair.getKey().intValue()<=to){
	
        System.out.println(pair.getKey() + " : " + pair.getValue());  

        }
    }	
}
}


