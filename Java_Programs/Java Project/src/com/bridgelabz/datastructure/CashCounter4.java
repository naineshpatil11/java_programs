/*
 * Purpose:  Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw 
 *           Cash.
 * @author: Nainesh R Patil.          
 */
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class CashCounter4
{
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int amount =0;
		int balance=10000;
		System.out.println("Enter the no of people in a queue" );	
		int n= sc.nextInt();
		MyQueue1<Object> m=new MyQueue1<Object>(n);	
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the name of "+i +" person");
			String name= sc.next();
			boolean t = m.enqueue(name); 	
			if(t == false) //to check name inserted or not
			{
				System.out.println("person not added");
			}
		}

		//System.out.println("\n"+"The people in Queue are as follow: " );
		System.out.println( m.toString() );
		for(int i=0;i<n;i++)
		{
			System.out.println("Welcome: person no: "+ i);

			//System.out.println("\n"+"The Current QUEUE is: "+ m.toString());

			System.out.println("Please choose the option: \n1. Deposit \n2. Withdraw");
			int ch =sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("Please enter amount you want to deposite: "); 
				amount=sc.nextInt();

				balance= balance + amount; 

				System.out.println("New balance is: "+balance);
				break;

				case 2: System.out.println("Please enter amount you want to withdraw: "); 
				amount=sc.nextInt();

				balance= balance - amount; 

				System.out.println("New balance is: "+balance);
				break;
			
				default :
					System.out.println("Enter valid input");
			 
			}
			m.dequeue();  
			System.out.println("  Thank You For Banking ");
			System.out.println("Next Person");
		}
	}
}

