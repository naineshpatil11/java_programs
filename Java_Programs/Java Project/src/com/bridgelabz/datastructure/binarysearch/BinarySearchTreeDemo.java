/*
 * Purpose: Program to write a binary serch tree.
 * @author: Nainesh R Patil.
 */
package com.bridgelabz.datastructure.binarysearch;
import java.util.Scanner;
public class BinarySearchTreeDemo 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			BinarySearchTree bst = new BinarySearchTree();
			try
			{
				int i;
				int arr[] = new int[6];
				System.out.println("Enter nubers: ");
				for( i = 0; i < arr.length; i++)
				{
					arr[i] = sc.nextInt();
				}
				for( i = 0; i < arr.length; i++)
				{
					bst.insert(arr[i]);
				}
				bst.inorder();
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
}

