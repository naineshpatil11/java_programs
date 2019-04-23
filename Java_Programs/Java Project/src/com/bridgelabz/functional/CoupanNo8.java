/*
 * Purpose: Program to generate random number.
 * @author: Nainesh R Patil.
 */

package com.bridgelabz.functional;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CoupanNo8 
{
	public static void coupanNumber(int num)
	{		
		Random ran = new Random();
		Set set = new HashSet();
		int ranNumber = 0;			
		for (int i=0;i<num;i++)
		{
			ranNumber = ran.nextInt(100);
			set.add(ranNumber);
		}
			System.out.println(set);
		}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		try 
		{
			System.out.print("Enter a Number :");
			int num = sc.nextInt();
		}
		catch (Exception e)
		{
			System.out.println("Wrong Input");
			System.exit(0);
		}
			int num=0;
			coupanNumber(num);
	}
	
}
