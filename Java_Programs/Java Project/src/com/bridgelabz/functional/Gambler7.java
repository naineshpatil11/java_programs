/*
 * Purpose: To print the percentage of Win and Loss.
 * @author: Nainesh R Patil.
 * 
 */
package com.bridgelabz.functional;
import java.util.Random;
import java.util.Scanner;

public class Gambler7
{
	public static void main(String[] args) 
	{
		
		    	// Take number from the user
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter a no of stack: ");
		    	int stake  = sc.nextInt();  
		    	System.out.println("Enter no of goal: ");
		    	int goal   = sc.nextInt(); 
		    	System.out.println("Entet no of trial: ");
		        int trials =sc.nextInt();   
		        int bets = 0;        
		        int wins = 0;         
		        // repeat trials times
		        for (int i = 0; i < trials; i++) 
		        {
		            int cash = stake;
		            while (cash > 0 && cash < goal) 
		            {
		                bets++;
		            }
		             if (Math.random() < 0.5)
		             {
		                	cash++; 
		             }// win $1
		              else
		              {
		                	cash--;
		              }// lose $1
		            
		            if (cash == goal)
		            	wins++;                
		        }
		        System.out.println(wins + " wins of " + trials);
		        System.out.println("Percent of games won = " + 100.0 * wins / trials);
		        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	}
}

