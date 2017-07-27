package com.practice;

public class CalculatorFunctions {
	
	static float c;
	public static float add(float a, float b)
	{
		c= a+b;
		return c;
	}

	public static float subtract(float a, float b)
	{
		c= a-b;
		return c;
	}
	
	public static float multiply(float a, float b)
	{
		c= a*b;
		return c;
	}
	
	public static float divide(float a, float b)
	{
		c= a/b;
		return c;
	}
}
