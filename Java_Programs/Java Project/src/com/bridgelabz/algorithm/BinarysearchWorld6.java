/*
 * Purpose: To read the list of words from file and  enter world to be search.
 *  
 *  @authoe: Nainesh R Patil. 
 */

package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BinarysearchWorld6 
{
	static Scanner sc=new Scanner(System.in);
	 public static void main(String[] args)
	 {
		int res;
		res=binarySearchWord();
		if(res==0)
		{
			System.out.println("Word found");
		}
		else 
		{
			//String input = null;
			System.out.println("Word not found ");
		}
	 }
	public static int binarySearchWord() 
	{
		String  temp = null;
		try 
			{
				BufferedReader br = new BufferedReader(new FileReader("/home/admin1/Documents/nainesh/file.txt"));
				try
				{
					String a = br.readLine();	// read line from file
					// split line into words and saperated by comma and store words in array
					String arr[] = a.split(" ");
					for (int i = 0; i < arr.length; i++) 	// sort names
					{
						for (int j = i + 1; j < arr.length; j++) 
						{
							if (arr[i].compareTo(arr[j]) > 0) // check if arr[j] is greater than arr[i]

							{
								temp = arr[i];	// if greater then swap positions
								arr[i] = arr[j];
								arr[j] = temp;
							}
						}
					}

					// display world list read from file
					System.out.println("\n List of worlds are: ");
					for (int i = 0; i < arr.length; i++) 
					{
						if(i<arr.length)
						{
							System.out.println(arr[i]+"");
						}
						else if(i == arr.length - 1)
						{
							//break;
						}
						//System.out.print(arr[i]);
						//if (i == arr.length - 1)
							//break;
						//System.out.print(",");
					}

					System.out.println();
					// ask user for word to be search
					System.out.println("Enter world you want to search: ");
					String input = sc.next();
					int first = 0, last = arr.length - 1;

					while (first <= last) 
					{
						int mid = (first + last) / 2; // get mid world
						if (input.compareTo(arr[mid]) == 0) // compare mid with user entered word
						{
							return mid;
						} 
						else if (input.compareTo(arr[mid]) > 0) // check whether word is greater than mid
						{
							first = mid + 1;
						}
						else 
						{
							last = mid - 1; // change last to mid-1
						}
					}

				} 
				catch (IOException e)
				{
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println(e);
				}
			} 
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);

			}
			return -1;
		}
}
