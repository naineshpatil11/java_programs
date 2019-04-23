/*
 * Purpose: To convert the temperature in farenhit or celcius.
 * 
 * @author: Nainesh R Patil. 
 */
package com.bridgelabz.algorithm;
import java.util.Scanner;

public class TempConversion12 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter temp in c or f");
			int temp = s.nextInt();
			char t = s.next().charAt(0);
			
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') 
			{
				System.out.println("Enter correct input");
				return;
			}
			temp = Util.temperaturConversion(temp, t);
			System.out.println("coverted temp is " + temp);
		} 
		catch (Exception e) 
		{
			System.out.println("Temperature must in format 45 c or 32 f :");
		}
	}
}
