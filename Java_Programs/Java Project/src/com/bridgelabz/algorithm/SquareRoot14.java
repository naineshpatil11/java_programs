/*
 * Purpose: To find the square root of non-negative number
 * 
 * @author: Nainesh R Patil
 * 
 */
package com.bridgelabz.algorithm;

import java.util.Scanner;

public class SquareRoot14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to find Square root: ");
		double n = s.nextDouble();
		double result = Util.sqrt(n);
		System.out.println("Square root is: " + result);
	}
}
