/*
 * Purepose: To convert the decimal number into binary and swape this binary 
 * number and then convert swaped binary into decimal.
 * 
 * @authoe: Nainesh R Patil.
 * 
 * 
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Binary 
{
	public static void main(String[] args)
	{
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a no: ");
			int[] binary = Utility4.toBinary(s.nextInt());
			System.out.println("Binary is: ");
			showArr(binary);
			swapNibbles(binary);
			System.out.println("After swapping: ");
			showArr(binary);
			int swapDeci = Utility4.toDecimal(binary);
			System.out.println("Decimal of swapped binary is: " + swapDeci);

			if (powerOf2(swapDeci))
				System.out.println("Its power of 2");
			else
				System.out.println("Not power of 2");
		} 
		catch (Exception e)
		{
			System.out.println("Enter input as integer ");
		}

	}
	
	 // Function to print array
	 
	static void showArr(int[] arr)
	{
		// System.out.println("Array is: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	
	 //Function to check if no is power of 2
	 
	static boolean powerOf2(int n) 
	{
		// calculate power of 2 using math.pow
		// check if is equal to given no
		// stops if pow is greater than given number
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n)
		{
			if (temp == n) 
			{
				return true;
			}
			i++;
		}
		return false;
	}

	
	 // Function to swap nibbles in array
	 
	static int[] swapNibbles(int[] arr)
	{
		// swap nibbles at first and last of the array
		// j is used for saving last 4 index of the array
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) 
		{ // loop runs 4 times and swap first four to last four elements
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}	
}


