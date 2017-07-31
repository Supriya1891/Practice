package com.bitwise;

import java.util.Scanner;

public class MarriageEligibility extends Exception {

	static String Name, Gender;
	static int age;

	public void checkMarriageEligibilty() {
		try {
			if ((Gender.equals("Male") && age > 21) || (Gender.equals("Female") && age > 18)) {
				System.out.println(" User is eligible for marriage");
			} else {
				throw new MyException("User is not elgible for marriage");
			}
		} catch (MyException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		Name = sc.next();

		System.out.println("Enter Age");
		age = sc.nextInt();

		System.out.println("Enter Gender (Male /Female)");
		Gender = sc.next();

		MarriageEligibility me = new MarriageEligibility();
		me.checkMarriageEligibilty();

	}

}
