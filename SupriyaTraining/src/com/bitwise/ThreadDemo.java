package com.bitwise;

public class ThreadDemo extends Thread {

	synchronized void printNumbers() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(4000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo TD = new ThreadDemo();
		TD.printNumbers();
	}
}