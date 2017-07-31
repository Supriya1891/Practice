package com.bitwise;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i, num;
		String PrimeNumbers = "";

		for (i = 100; i >= 0; i--) {
			// System.out.println(i);
			int counter = 0;
			for (num = i; num > 0; num--) {
				// System.out.println(num);
				if (i % num == 0)
					counter = counter + 1;
			}

			if (counter == 2) {
				PrimeNumbers = PrimeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers between 100 to 1 : " + PrimeNumbers);
	}
}
