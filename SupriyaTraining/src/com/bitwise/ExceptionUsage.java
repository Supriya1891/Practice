package com.bitwise;

public class ExceptionUsage {

	// int num1,num2;
	int a[] = new int[5];

	int divide() throws Exception {
		int result = 0;
		try {
			// this.num1=num1;
			// this.num2=num2;
			result = a[0] / a[6];
			throw new Exception();
		} catch (ArithmeticException e) {
			System.out.println(e);
			// e.getMessage();
			// e.printStackTrace();
		}
		// catch (ArrayIndexOutOfBoundsException e1)
		// {
		// System.out.println(e1);
		// }

		return result;

	}

	public static void main(String[] args) {
		ExceptionUsage res = new ExceptionUsage();
		try {
			System.out.println(res.divide());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
