package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Palindrome5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	 
		System.out.print("Enter string: ");
		String s=sc.next();
		char c[]= s.toCharArray();
		Dequeue<Object> m=new Dequeue<Object>(c.length);	 
		for(int i=c.length-1 ; i>=0 ;i--)
		{
			m.rearenqueue(c[i]);	
		}
		 
		//System.out.println("\n"+"The New MyDeque array is: "+"\n"+ m);
		//System.out.println("\n"+"Matching both input and dequeue strings");	
		boolean status=true; //to store condition-->matched or not
	    	 
	   //to traverse each element of the Deque and match with Char Array{i/p string} 	  
		for(int i=0 ; i<c.length ;i++)
		{
			if(c[i]!=(char) m.frontdequeue())
			{
				status=false;	
				break;
			}
				status=true;
			}
			if(status)
			{
				System.out.println("string is palindrome");
			}
			else
			{
				System.out.println("string is not a palindrome");
			}
	}					
}
