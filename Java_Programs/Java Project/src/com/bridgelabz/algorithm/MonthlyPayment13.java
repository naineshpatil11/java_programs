package com.bridgelabz.algorithm;

import java.util.Scanner;

public class MonthlyPayment13 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principal,Year and rate");
		double p=s.nextDouble();
		double y=s.nextDouble();
		double r=s.nextDouble();
		double result=Util.monthlyPayment(p,y,r);
		System.out.println("Monthly payment is: "+result);
	}
	
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter principal ,year and rate");
		double p = Integer.parseInt(args[0]); 
		double y = Integer.parseInt(args[1]); 
		double r = Integer.parseInt(args[2]); 
		System.out.println("mothly payment is " + Util.monthlyPayment(p, y, r));
	}*/
	
	
}
