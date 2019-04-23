package com.bridgelabz.objectoriented;

import java.util.Scanner;

public class StockReport3 
{
	static int nstock;
	static float sum = 0;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of stock: ");
		nstock = sc.nextInt();
		
		for(int i = 1; i < nstock+1; i++ )
		{
			System.out.print("Enter "+i+" share name: ");
			String name = sc.next();
			System.out.print("Eneter number of share: ");
			int nshare = sc.nextInt();
			System.out.print("Eneter share's price: ");
			float price = sc.nextFloat();
			float result = stockValue(nshare,price);
			System.out.println("Value of "+i+" stock is: "+result);
		//	System.out.println("");
			System.out.println("          **************");
		}
		System.out.println("Total stock value is: "+sum);
		
	}

	public static float stockValue(int nshare, float price)
	{
		
		float value = price * nshare;
		float val = value;
		sum = sum + val;
		return value;
	}
}
