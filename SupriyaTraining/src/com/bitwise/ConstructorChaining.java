package com.bitwise;

public class ConstructorChaining {

	ConstructorChaining ()
	{		
	System.out.println("this is parent's default constructor");		
	}
	
	ConstructorChaining (int x,int y)
	{
		this();
		System.out.println(x*y);
	}
	
	ConstructorChaining (int x)
	{
		this(4,5);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		new ConstructorChaining(2);
	}

}
