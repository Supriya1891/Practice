package com.bitwise;

public class EvenThread extends Thread{

	int TD;
	void setTD(int TD)
	{
		this.TD=TD;
	}
	int getTD()
	{
		return TD;
	}
	@Override
	public void run()
	{
		EvenOddThread.print(getTD());			
		
	}
	
}


