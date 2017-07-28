package com.bitwise;

class MyException extends Exception {
	String str1;

	MyException(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("Error  = " + str1);
	}
}