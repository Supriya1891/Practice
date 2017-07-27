package com.bitwise;

public class ConstructorOverloading {

	ConstructorOverloading ()
	{		
	System.out.println("this is parent's default constructor");		
	}
	
	ConstructorOverloading (int x,int y)
	{
		System.out.println(x*y);
	}
	
	ConstructorOverloading (int x)
	{
		
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		new ConstructorOverloading();
		new ConstructorOverloading(2);
		new ConstructorOverloading(3,4);
	}

}
