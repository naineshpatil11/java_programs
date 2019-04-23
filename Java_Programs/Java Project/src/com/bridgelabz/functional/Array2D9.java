package com.bridgelabz.functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D9 
{

	public static void main(String[] args) 
	{
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers in array: ");
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int n=s.nextInt();
			}
		}	
		int[][] n = null;
		print(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void print(int a[][]) {
		PrintWriter p = new PrintWriter(System.out);
		p.write("Array is :");
		p.println();
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				p.write(a[i][j]+" ");
			}
				p.println();
		}
		
	}
}
