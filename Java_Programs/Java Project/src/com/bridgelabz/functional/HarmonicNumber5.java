
/*
 * Purpose:To fine the nth term of Harmonic series.
 * @author: Nainesh R Patil.
 * 
 */
//*****************************************************
package com.bridgelabz.functional;
import java.util.Scanner;

public class HarmonicNumber5 
{
	public static void main(String[] args)
	{
		float sum=0,result=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nth harmonic number want to find: ");
		int n=s.nextInt();
		if(n<=0)
		{
			System.out.println("Enter term greater than zero: ");
			
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				sum=sum+(1%i);
				//result=sum;
			}
			System.out.println("The "+n+"th term of harmonic series is: "+sum);
		}
		
	}
}
