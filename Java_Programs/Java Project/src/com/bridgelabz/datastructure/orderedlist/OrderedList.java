/*
 * Purpose: Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. Take 
 *          user input for a number, if found then pop the number out of the list else insert the number
 *           in appropriate position.

 * @author: Nainesh R Patil.
 */
package com.bridgelabz.datastructure.orderedlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import com.bridgelabz.datastructure.LinkedList2;
import com.bridgelabz.datastructure.Utility;

//import com.bridgelabz.datastructure.FileNotFoundException;
//import com.bridgelabz.datastructure.UnOrderList;

public class OrderedList 
{
	public static void main(String[] args) 
	{
		try
		{
		int a;
		File file = new File("/home/admin1/Documents/nainesh/ordered.txt");
		Scanner sc = new Scanner(file);
		Scanner s = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		LinkedList1 list = new LinkedList1();
		
		int arr[] = new int[str.length];
		int num = 0;
		
		//converted string array into integer array
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
	
		
		//add element to list
		for(int k = 0; k < arr.length; k++)
		{	
			list.add(arr[k]);
		}
		list.show( );
		System.out.println();	
		System.out.println("Enter number to search: ");
		int num1 = s.nextInt();
		if(list.search(num1))
		{
			System.out.println("Number is found hence removed: ");
			list.remove(num1);
			list.show();
		}
		else
		{
			System.out.println("Number is not found hence added: ");
		}
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}      
}	
	
	
