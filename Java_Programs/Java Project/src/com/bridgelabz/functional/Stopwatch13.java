package com.bridgelabz.functional;

import java.util.Scanner;

public class Stopwatch13 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1 to start");
		s.next();
		startTime();
		System.out.println("enter to stop");
		s.next();
		stopTime();
        elapsedTime();
	}

		static double start=0,stop=0,ela=0;
		 static void startTime()
	{
		long start = System.currentTimeMillis();
		System.out.println("started at " + start);
		
	}

		 static void stopTime()
	{
		long stop = System.currentTimeMillis();
		System.out.println("stop time "+stop);
	}

		 static void elapsedTime() 
	{
		ela = (stop-start);	
		System.out.println("Elapsed time is "+ela);
	}
}
