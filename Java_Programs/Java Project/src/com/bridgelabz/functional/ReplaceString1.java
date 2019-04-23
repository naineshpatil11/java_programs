package com.bridgelabz.functional;

import java.util.Scanner;

public class ReplaceString1 
{
	public static void main(String[] args) 
	 /*	{
			//String n;
			Scanner s=new Scanner(System.in);
			System.out.println("enter user name");
			String name=s.next();
			int l=name.length();
			
			//String n=name;
			if(l>3)
				System.out.println("Hello "+name+", How are you?");
			else
				System.out.println("User name Invalid");
				
		}*/
		{
			Scanner s = new Scanner(System.in);
			String st = "Hello <<UserName>>, How are you?";
			System.out.println("enter username");
			String n = s.nextLine();
			int l=n.length();
			if(l>3)
			{
			    st = st.replaceAll("<<UserName>>", n);
			    System.out.println(st);
			}
			else
				System.out.println("User name Invalid");
			//s.close();
		}
}
