/*
 * Purpose: To find the prime number between given range.
 * 
 * @author: Nainesh R Patil.
 * 
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class PrimeNoRange2 
{
	public static void main(String[] args) 
	{
		int i,count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first and second number");
		int fno =s.nextInt();
		int sno=s.nextInt();
		System.out.println("Palindrom number between "+fno+" and "+sno+" is: ");
		for(int x=fno+1;x<=sno-1;x++)
		{
			for( i=2;i<=x;i++)
			{
				if(x%i==0)	
				break;
			}
			
				if(i==x)	
				System.out.print(x+",");
		}
		
		System.out.println("\n");
		int x=0;
		palidrom(x);
	}
	
	public static void palidrom(int x)
	{
		//int x=612;
		int ans=0,rem,a;
		a=x;
		
		while(x!=0)
		{
			rem=x%10;
			ans=ans*10+rem;
			x=x/10;
		}
		/*
		 * if(a==x) { System.out.println("Palimdrom no's are: "); } else {
		 * System.out.println("not palimdrom"); }
		 */
	}
}

