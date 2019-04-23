/*
 * Purpose: Program to search a number using hashing function.
 * @author: Nainesh R Patil.
 */
package com.bridgelabz.datastructure;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HashingFunction 
{
	public static void main(String[] args) throws IOException  
	{
		File file = new File("/home/admin1/Documents/nainesh/Hash.txt");
		Scanner scr = new Scanner(file);
		int ar[] = new int[10];
		int num  = 0;
		Hashing6 hash = new Hashing6();
		Scanner sc = new Scanner(System.in);
		String[] str = scr.nextLine().split(" ");
		try {
			for (int i = 0; i < str.length; i++) {
				ar[i] = Integer.parseInt(str[i]);
			}
			for (int i = 0; i < str.length; i++) {
				hash.addHash(ar[i]);
			}
			hash.showHash();
			System.out.print("Enter a number :");
			num = sc.nextInt();
			if(hash.search(num)) {
				hash.remove(num);
			}
			else {
				hash.addHash(num);
			}
			hash.showHash();
		} catch (Exception e) {
			System.err.println("Wrong Input");
			e.printStackTrace();
			System.exit(0);
		}
	
	}
}
