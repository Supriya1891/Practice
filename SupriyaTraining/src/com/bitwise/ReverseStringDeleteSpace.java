package com.bitwise;

public class ReverseStringDeleteSpace {

	static final String pwd = "abc xyz";

	static void reverseString() {
		int l = pwd.length();
		//System.out.println(l);
//		for (int i = (l -1); i >= 0; i--) 
//					
//		{
//			if (pwd.charAt(i) != ' ')
//			System.out.print(pwd.charAt(i));
//		}
		int i=l;
		do 
		{
			if (pwd.length() > 0 && pwd.charAt(i-1) != ' ')
			System.out.print(pwd.charAt(i-1));
			i--;
		}
			while (i > 0);
	}

	public static void main(String[] args) {

		reverseString();

	}
}
