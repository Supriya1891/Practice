package com.bitwise;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectionDemo {

	public static void main(String[] args) {
		Class cls = ArrayList.class;

		Method[] methods = cls.getDeclaredMethods();

		for (Method mthd : methods) {
			System.out.println(mthd.getName());
		}
	}
}