package com.practice;

import java.util.Scanner;

public class Calculator {
static int function,a,b;
	public static void main(String[] args) {
		user

	}
	
	public  float calculator {
		switch(function)
		{
		case 1: CalculatorFunctions.add(a, b);
		break;
		case 2: CalculatorFunctions.subtract(a, b);
		break;
		case 3:CalculatorFunctions.add(a, b);
		break;
		case 4:CalculatorFunctions.add(a, b);
		break;
		default: System.out.println("Not a valid operation");
		}
	}
	
	public static int userInputFunction
	{
		System.out.println("Please enter action to perform ");
		System.out.println("1.Addition");
		System.out.println("2.Substarction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		Scanner ip1= new Scanner(System.in);
		int function = ip1.nextInt();
		}
	
	public static float userInputNumbers{
		System.out.println("Enter the numbers");
		
		System.out.println("first number is");
		Scanner num1= new Scanner(System.in);
		float a = num1.nextFloat();
		
		System.out.println("Second number is");
		Scanner num2= new Scanner(System.in);
		float b = num2.nextFloat();
		
		
		}
	
}
