/*
 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List. Take a user 
 *          input to search a Word in the List. If the Word is not found then add it to the list, and if
 *           it found then remove the word from the List. 
 *@author: Nainesh R Patil.
 */
package com.bridgelabz.datastructure.unordered;
//package com.bridgelabz.datastructure;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
	
public class UnorderedList 
{
		public static void main(String[] args) 
		{
			try
			{
				File f1 = new File("/home/admin1/Documents/nainesh/file.txt");
				//System.out.println(f1);
				String word = null;
				Scanner s = new Scanner(f1);
				Scanner sc = new Scanner(System.in);
				LinkedList list = new LinkedList();
				String str[] = s.nextLine().split(" "); 
			
				for(int i = 0; i < str.length; i++)
				{
				list.insert(str[i]);
				}
				list.show();
				//System.out.println(str);
				System.out.print("Enter a word : ");
				word = sc.next();
				if(list.search(word)) 
				{
					System.out.println("Element is found\nElement removed from list");
					list.remove(word); 
				}
				 else 
				{
					System.out.println("Element not found \n Element added to list");
					list.insert(word);
				}
				list.show();
			//	System.out.println("String " +word+" is removed ");
				
				/*
				 * if(list.search(!=(word)) { list.insert(word); }
				 */
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
		




