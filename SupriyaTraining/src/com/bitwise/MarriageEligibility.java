package com.bitwise;

import java.util.Scanner;

public class MarriageEligibility extends Exception {

	static String Name, Gender;
	static int age;

	public void checkMarriageEligibilty() {
		try {
			if ((Gender == "Male" && age > 21) || (Gender == "Female" && age > 18)) {
				System.out.println(" User is eligible for marriage");
			} else {
				throw new MyException("User is not elgible for marriage");
			}
		}

		catch (MyException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Scanner a1, a2, a3;

		System.out.println("Enter name");
		a1 = new Scanner(System.in);
		if (a1.hasNext()) {
			Name = a1.next();
		}

		System.out.println("Enter Age");
		a2 = new Scanner(System.in);
		if (a2.hasNext()) {
			age = a2.nextInt();
		}

		System.out.println("Enter Gender (Male /Female)");
		a3 = new Scanner(System.in);
		if (a3.hasNext()) {
			Gender = a3.next();

			MarriageEligibility me = new MarriageEligibility();
			me.checkMarriageEligibilty();

		}

	}

}
