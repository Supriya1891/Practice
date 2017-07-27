package com.bitwise;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {

		GetAddress A1, A2, A3, A4;
		A1 = new WorldOfficeAddress();
		A2 = new NextgenOfficeAddress();
		A3 = new GlobusOfficeAddress();
		A4 = new TerraTowerOfficeAddress();

		String office = null;
		System.out.println("Enter the office name");
		Scanner s = new Scanner(System.in);

		try {

			if (s.hasNext()) {
				office = s.next();
			}

			switch (office) {
			case "World":
				System.out.print("World = ");
				A1.address();
				break;
			case "Nextgen":
				System.out.print("Nextgen = ");
				A2.address();
				break;
			case "Globus":
				System.out.print("Globus = ");
				A3.address();
				break;
			case "Terratower":
				System.out.print("Terratower = ");
				A4.address();
				break;
			default:
				System.out.println("Please enter valid office name");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close();
		}

	}

}
