package com.bridgelabz.datastructure;
/**
 * @author admin1
 * 
 * */
 
import java.util.Scanner;

public class PrimeNoAnagram12 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=s.nextInt();
		int[] primeno=new int[range];
		primeno=Utility.PrimeNumber(range);
		int[] anagram = Utility.checkAnagram(primeno);		
		Utility.twoDPrimeAnagram(anagram);	
	}
}
