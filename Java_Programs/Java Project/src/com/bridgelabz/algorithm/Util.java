/*
 * Purpose: Util class involve other sub class.
 * 
 * @author: Nainesh R Patil
 * 
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Util
{
/* Day of week */
	
	static int dayOfWeek(int d, int m, int y) 
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int result = (d + x + (31 * m0) / 12) % 7;
        return result;
	}
//*****************************************************	
	/* Temp conversation */
	
	/*static double temperaturConversion(double tem) 
	{
		double result;
		char t;
		if (t == 'c' || t == 'C') 
		{
			result = (tem * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			result = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;

		}
		
		return result;
	}*/
	public static int temperaturConversion(int tem, char t) 
    {
		int result;
		if (t == 'c' || t == 'C') 
		{
			result = (tem * 9 / 5) + 32;
		} 
		else if (t == 'f' || t == 'F') 
		{
			result = (tem - 32) * 5 / 9;
		} 
		else 
		{
			System.out.println("Enter correct input");
			return 0;
		}
		return result;
    }
//********************************************************	
	/*Monthly payment*/
	
	//public static double monthlyPayment(double p, double y, double R) 
	//{
		/*double pay=0;
		double n=12*y;
		double r=R/(12*100);
		pay=(p*r)/(1-Math.pow((1+r),-n));
		return pay;*/
		public static double monthlyPayment(double p, double y, double R) 
		{
			double n = 12 * y;
			double r = R / (12 * 100);
			double payment = (p * r )/ (1 - Math.pow((1 + r), -n));
			return payment;
		}
//********************************************************
		/* calculate the square root of non-negative number*/
		
		public static double sqrt(double c) 
		{
			double t = c;
			double epsilon = 1e-15;
			while (Math.abs(t - c / t) > epsilon * t) 
			{
				t = (c / t + t) / 2;
			}
			return t;
		}
//*********************************************************
		//convert decimal to binary
		
		public static void  toBinary() 
		{
			int i = 0;
			int arr[] = new int[12];
            Scanner sc=new Scanner(System.in);
			System.out.println("Enter decimal number: ");
			int n = sc.nextInt();
			
			while(n>0)
			{
				arr[i] = n % 2;
				n = n /2;
				i++;
			}
			System.out.println("Binary is: ");
			for (int j = arr.length - 1; j > -1; j--) 
			{	
				System.out.print(arr[j]+" ");
			}
			

		}
}
