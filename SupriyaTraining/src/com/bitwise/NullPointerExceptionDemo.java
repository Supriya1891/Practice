package com.bitwise;

public class NullPointerExceptionDemo {

	public static void A(String roi) {
		try {
			String str="RateofInterest is";
			String msg=str.concat(roi);
			System.out.println(msg);
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Thrown from A");
			throw e;
		}
	}

	public static void B() {
		try {
			A(null);
		} catch (Exception e) {
			System.out.println("NullPointerException caught in B");
		}
	}

	public static void main(String[] args) {
		B();
	}

}
