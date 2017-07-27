package com.bitwise;

public class TernaryOperator {
	static int num = 9;
	  
	public static int returnResult ()
	{
		 int result = (num == 1) ?  1 :  ((num == 2) ? 2 : 0);
		 return result;
	}
//	static {
//		System.out.println("At compile time!");
//	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(returnResult());
		
	}

}
