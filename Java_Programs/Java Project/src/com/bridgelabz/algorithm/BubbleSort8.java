package com.bridgelabz.algorithm;

public class BubbleSort8 
{
	public static void main(String[] args) 
	{
		int arr[]= {12,12,3,1,8,22,40,10};
		//Utility4 u[]=new Utility4();
		//u[].bubbleSort(arr);
		int in[]=Utility4.bubbleSort(arr);
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(in[i]);
		}
	}
}
