package com.bitwise;

 public class EvenOddThread extends Thread {
	
	 static void print(int TD)
	{
		System.out.println("Thread "+TD+" Running");
	}

	public static void main(String args[])
	{
		Thread threads[]=new Thread[11];
		
		for(int i=2;i<=threads.length;i+=2){
			EvenThread et=new EvenThread();
			et.setTD(i);
			threads[i]=new Thread(et);
			threads[i].start();			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
									
		}
		for(int i=1;i+1<=threads.length;i+=2){
			
				OddThread ot=new OddThread();
				ot.setTD(i);
				threads[i]=new Thread(ot);
				threads[i].start();		
				try {
					sleep(1000);	
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
	}
}
