package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Date11 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter date: ");
		int d=s.nextInt();
		int m=s.nextInt();
		int y=s.nextInt();
		int result=Util.dayOfWeek(d, m, y);
		System.out.println("Days of week is: "+result);
	}
}
