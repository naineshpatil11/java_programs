package com.bridgelabz.objectoriented.commercialdataprocessing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

//import com.bridgelabz.objectoriented.Commercialstock5;

public class stockAccount5 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException 
	{
		CommercialStock5 stock = new CommercialStock5();
		Scanner sc = new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter the option you want to do: \n 1.Add \n 2.Buy \n 3.Sell \n 4.Print Report");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					stock.addDetails();
					break;
				case 2:
					stock.buy();
					break;
				case 3:
					stock.sell();
					break;
				case 4:
					stock.printReport();
			}	
					System.out.println("Do you want to comtinue (Y/N)");
					ch = sc.next().charAt(0);
		}
			while(ch == 'Y' || ch == 'y');
	}
}
