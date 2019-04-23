package com.bridgelabz.functional;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin2
{
	public static void Flipcoin(int n)
	{
		int head =0;
		int tail=1;
		Random r= new Random();
		float head1=0.0f;
		float tail1=0.0f;
		float headper =0.0f;
		float tailper=0.0f;
		for(int i=0;i<n;i++)
		{
			if (Math.random() > 0.5) 
			{
			head1++;
			}
		else
			tail1++;
		}
		headper=(head1/n)*100;
	    tailper=(tail1/n)*100;
	    System.out.println("Headpercentage is: "+headper);
	    System.out.println("Tailpercentage is: "+tailper);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		 Flipcoin(n);
	}
}
