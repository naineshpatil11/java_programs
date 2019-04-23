package com.bridgelabz.datastructure;

import java.util.Scanner;

public class PrimeAnagramStack13 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int first=s.nextInt();
		System.out.println("Enter last numbre");
		int last=s.nextInt();
		System.out.println("The prime numbers between the given range are: ");
		primeandAnagram(first,last);
		
	}

	static Stack st = new Stack();
	static int counter = 0;
	public static void primeandAnagram(int first, int last) 
	{
	
		//array to store the prime number
		int arr[] = new int[last];
		
		//check numbers are prime or not
	
		
		for(int i=first;i<last;i++)
		{
			if(Utility.isPrime(i))
			{
				arr[counter]=i;//insert element if it prime
				counter++;
			}
		}
		
		//print prime number
		System.out.println("Prime numbers are: ");
		for(int k=0;k<counter;k++)
		{
			System.out.println(arr[k]);
		}
		System.out.println("The prime and anagram numbers are: ");
		for(int k = 0;k < counter; k++)
		{
			//int reverse = Utility.checkAnagram( int arr);
			int reverse = Utility.anagram(arr[k]);
			{
				for(int j = 0;j < counter; j++)
				{
					if(arr[j] == reverse)
					{
						st.push(arr[k]);
						st.push(reverse);
					}
				}
			}
			System.out.println(reverse);
		}
		
	}
}
