package com.bitwise;

public class Event {	
	public static void main(String[] args) {
		Performance P1,P2,P3;
		
		P1 =new Singing();
		System.out.print("Participant- 1 "); 
		P1.Performing();
		
		P2= new Comedy();
		System.out.print("Participant- 2 "); 
		P2.Performing();
		
		P3= new Dancing();
		System.out.print("Participant- 3 ");
		P3.Performing();
	}

}
