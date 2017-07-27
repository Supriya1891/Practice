package com.bitwise;

public class MaxMinFind {

	int min, max;
	int num[] = { 12, 56, 22, 4559999, -1 };

	int getMinValue() {
		if (num.length > 0)

		{
			min = num[1];
			for (int i : num) {
				if (i < min) {
					min = i;
				}
			}
		}

		return min;
	}

	int getMaxValue() {
		if (num.length > 0)

		{
			max = num[1];
			for (int i : num) {
				if (i > max) {
					max = i;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		MaxMinFind s1 = new MaxMinFind();

		
		System.out.println("Max number of an array is " + s1.getMaxValue());
		System.out.println("Min number of an array is " + s1.getMinValue());
		
	}

}
