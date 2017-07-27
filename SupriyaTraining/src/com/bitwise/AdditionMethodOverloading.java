package com.bitwise;

public class AdditionMethodOverloading {

	static int addConcat(int a,int b)
	{
		int c= a+b;
		return c;
	}
	
	static String addConcat(String a,String b)
	{
		String c= a.concat(b);
		//String c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(addConcat(1,2));
		System.out.println(addConcat("Supriya","Jadhav"));
	}

}
