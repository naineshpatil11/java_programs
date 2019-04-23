/*
 * Purpose: check two strings are anagram or not.
 * 
 * @author: Nainesh R Patil.
 * 
 */
package com.bridgelabz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String s1=s.next();
		String s2=s.next();
		
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		String sorts1 = new String(a1);
		String sorts2 = new String(a2);
		if(sorts1.equals(sorts2))
		{
			System.out.println("Strings are Anagram");
		}
		else
			System.out.println("Strings are not Anagram");
	}	
}
