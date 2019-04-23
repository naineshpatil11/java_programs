package com.rough;

//import java.util.LinkedList;
import java.util.Scanner;

public class BBSortLinked 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("Enter number in array");
		int arr[]  = new int[6];
		for(int i = 0; i < arr.length; i++)
		{
			int num = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			list.add(arr[i]);
		}
		System.out.println("Sorted list is: ");
		list.show();
	}
}
