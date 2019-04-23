package com.bridgelabz.algorithm;

import java.util.Scanner;

public class VendingMachine10 
{
	 static int i,total;
	 static int notes[] = {1000,500,100,50,10,5,2,1};

	public static void main(String[] args) 
	{
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter amount");
			int amnt=s.nextInt();
			notes(amnt);
			//System.out.println(700%500);
		}
		catch(Exception e)
		{
			System.out.println("Enter integer amount");
		}
	}

	public static void notes(int amnt)
	{
		if (amnt / notes[i] != 0)
		{
			total =total+ (amnt / notes[i]);
			System.out.println(notes[i] + " Rs notes :" + amnt / notes[i]);
		    amnt =amnt % notes[i];
		}
		i++;
		if (amnt == 0) 
		{
			System.out.println("Total notes :" + total);
			return;
		}
		notes(amnt);
	}
}
