package com.bridgelabz.objectoriented.commercialdataprocessing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class CompanyLinkedList6 
{
	public static void main(String[] args) throws Exception
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		CompanyShareLinkedListMethods stock = new CompanyShareLinkedListMethods();
		do
		{
			System.out.println("Choose the option you want to do: 1.Add \n 2.Buy \n 3.sell \n 4.Print Report");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				stock.addDetails();
				break;
			case 2:
				stock.buyStock();
				break;
			case 3:
				stock.sellStock();
				break;
			case 4:
				stock.printReport();
				break;
			default:
				System.out.println("Choose valid Option");
					
			}
			System.out.println("Do you want to continue (Y/N)");
			ch = sc.next().charAt(0);
		}
		while(ch == 'Y'|| ch == 'y');
	}
}
