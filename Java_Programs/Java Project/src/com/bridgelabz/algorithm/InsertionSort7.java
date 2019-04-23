/*
 * Purpose: Read strings from standard input and print them in sorted order
 * 
 * @author: Nainesh R Patil
 * 
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSort7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    try 
	    {
		 System.out.print("Enter a list of word :");
		 String str = sc.nextLine();
		 String str1[] = str.split(" ");//splirt  
		 String in[]=Utility4.insertionSort(str1);
		 for (String string : in)
		 {
			 System.out.println(string  );
		 }
		
	   }
	   catch (Exception e) 
	    {
		System.out.println("Wrong Input");
		//System.exit(0);
	    }
		
		 /*  System.out.println("Enter the String");
		   String st= sc.nextLine();//Read the User inputs..
		   char ch[]=st.toCharArray();//Convert the String Into Char type Array..
		   System.out.println("Enter the String Character by Character...");
		   for(int i=0;i<ch.length;i++)
		   {
			   System.out.print(ch[i]+" ");
		   }
		   Utility4 u = new Utility4();
		  // char in[]=Utility4.insertionSort(ch);
		   u.insertionSort(ch);
		   sc.close();
	}*/
	}
}
