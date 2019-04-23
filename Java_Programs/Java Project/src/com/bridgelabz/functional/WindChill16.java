package com.bridgelabz.functional;

import java.util.Scanner;

public class WindChill16 
{
	public static void main(String[] args)
	{
		try 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter temp in fahrenheit: ");
			double t = s.nextDouble();
			System.out.println("Enter wind speed in miles per hour: ");
			double v = s.nextDouble();
			if (Math.abs(t) > 50 || v > 120 || v < 3) 
			{
				System.out.println("Invalid input");
			} 
			else 
			{
				wind(t, v);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
    }

	private static void wind(double t, double v) 
	{
		double w;
		w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Wind chill: "+w);
	}
}
