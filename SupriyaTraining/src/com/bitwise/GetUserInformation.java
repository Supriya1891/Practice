package com.bitwise;

import java.util.Scanner;

public class GetUserInformation {

	static int id;
	String name, adr_street, adr_city, adr_cntr;

	public static void main(String [] args) {
		GetUserInformation e = new GetUserInformation();
		System.out.println("enter User id");
		Scanner uid = new Scanner(System.in);
		if (uid.hasNext())
		{
			id = uid.nextInt();			
		}
	      
		
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(u);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i) {
	         i.printStackTrace();

}
	}
