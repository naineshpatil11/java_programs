package com.bridgelabz.algorithm;

public class Rough 
{
	public static void main(String[] args)
	{
		  System.out.println("bubble sort integer"); 
		  int a[]= {2,5,8,12,43,7};
		  
		 int result[] =Utility4.bubbleSort(a);
		 for (int i : result)
		 {
			 System.out.println(i);
		 }
		 System.out.println("bubble sort string");
		 String str[] = {"Zaphar","Shbham","Nainesh", "Rahul","Ram", "Sham"};
		 String resu[]=Utility4.bubbleSort(str); 
		 for(String string : resu) 
		 {
			 System.out.println(string);
		 }
	}
}
