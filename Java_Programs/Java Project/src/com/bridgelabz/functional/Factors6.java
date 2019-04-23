package com.bridgelabz.functional;

import java.util.Scanner;

public class Factors6 
{
	public static void main(String[] args) 
	{
		int store = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		System.out.println("Factors are:");
		for(int i=2;n>1;i++)
		{
			while(n%i==0)
			{
				if(n%i==0)
				{
					System.out.println(i);
					n=n/i;
				}
				/*
				 * if(n>2) { System.out.println(n); }
				 */
				}
			}
		}
}
