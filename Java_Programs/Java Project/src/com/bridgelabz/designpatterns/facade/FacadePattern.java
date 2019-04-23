package com.bridgelabz.designpatterns.facade;

import java.util.Scanner;

public class FacadePattern 
{
	static int choice;
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Mobile Shop");
			System.out.println("  1.Iphone  ");
			System.out.println("  2.Samsung  ");
			System.out.println("  3.Blackberry  ");
			System.out.println("Enter  ur choice ");
			int choice  = sc.nextInt();
			ShopKeeper sk = new ShopKeeper();
			switch(choice)
			{
			case 1:
				sk.iphoneSale();
				break;
			case 2:
				sk.samsungSale();
				break;
			case 3:
				sk.blackberrySale();
				break;
			default :
				System.out.println("Not choose option");					
			}
		
		}
		while(choice != 4);
	}
}
