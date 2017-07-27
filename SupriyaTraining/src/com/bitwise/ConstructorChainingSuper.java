package com.bitwise;

public class ConstructorChainingSuper extends ConstructorChaining{
	
	ConstructorChainingSuper()
	{
		super(3);
		System.out.println("this is child's default constructor");
	}

	public static void main(String[] args) {
		
		new ConstructorChainingSuper();
	}

}
