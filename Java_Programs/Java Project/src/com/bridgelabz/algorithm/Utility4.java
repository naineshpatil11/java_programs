/*
 * Purpose: Utility class involve the all sorting algorithm method.
 * 
 * @author : Nainesh R Patil.
 * 
 */
//***************************************************
package com.bridgelabz.algorithm;
public class Utility4
{
/* Bubbble sort for Integer*/
	
	public static int[] bubbleSort(int arr[])
	{
		int  temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;	
	}
//*****************************************************
	/* Bubbble sort for string */
	
	public static String[] bubbleSort(String arr[])
	{
		String temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
				
		}
		
	  }
		return arr;
   }
//******************************************************	
	/* Insertion sort for Interger */
	
	public static int[] insertionSort(int arr[])
	{
		int temp,j;
		for(int i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		return arr;
		
	}
//*****************************************************	
	/* Insertion sort for string */
	
	public static String[] insertionSort(String inputArray[]) 
	{
		int lineNumber = inputArray.length;
	    int i,j;
	    String key;
		for (j = 1; j < lineNumber; j++)
		{
	        key = inputArray[j];
	        i = j - 1;
	        while (i >= 0) 
	        {
	            if (key.compareTo(inputArray[i]) > 0) 
	            {
	                break;
	            }
	            inputArray[i + 1] = inputArray[i];
	            i--;
	        }
	        inputArray[i + 1] = key;
		}
		return inputArray;
  }
	
//*******************************************************	
	/*public void insertionSort(char[] ch) 
	{
		for(int i=1;i<ch.length-1;i++)
		{		
			char ch1=ch[i];
			int j=i-1;
			while(j>=0 && ch1<ch[j])
			{
				ch[j+1]=ch[j];
				j--;
			}
			ch[j+1]=ch1;
	   	}
		System.out.println();
		System.out.println("String After the Insertion sort : ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
	}*/
//******************************************************	
	/* Binary search for Integer */
	
	public static int binarySearch(int ar[],int a)
	{
		int fst=0,lst=ar.length,mid=0;
		int arr[]=insertionSort(ar);
		
		while(fst <= lst)
		{
			mid=(fst+lst)/2;
			
				if(arr[mid]==a)
				{
					return mid+1;
				}
				if(arr[mid]<a)
				{
					fst=mid+1;
				}
				if(arr[mid]>a)
				{
					lst=mid-1;
				}	
		}
		return -1;
	}
	//binary search for string
	public static int binarySearch(String arr[],String a)
	{
		int fst=0,lst=arr.length,mid=0;
		String a1[]=insertionSort(arr);
		while(fst<=lst)
		{
			mid=(fst+lst)/2;
			if(a1[mid].equalsIgnoreCase(a))
			{
				return mid+1;
			}
			if(a1[mid].compareToIgnoreCase(a)<0)
			{
				fst=mid+1;
			}
			else
			{
				lst=mid-1;
			}
		}
		
		return -1;	
	}	
//****************************************************	
	// to convert decimal to binary
	
		public static int[] toBinary(int d)
      {
			String bin = "";
			while (d != 0) 
			  {
				bin = (d % 2) + bin;
				d = d/2;
			  }
			while (bin.length() % 4 != 0)
			  {  
				bin = 0 + bin;
			  }
			return stringToIntArray(bin);
		  }
//*******************************************************		
		// convert string to input array.
		
		static int[] stringToIntArray(String bin) 
		  {
			int[] binary = new int[bin.length()];
			for (int i = 0; i < binary.length; i++) 
			{
				binary[i] = bin.charAt(i) - 48;
			}
			return binary;
		  }
		
		// to convert binary to decimal 
		 
			public static int toDecimal(int[] binary) 
			 {
				int dec = 0, j = 0;
				for (int i = binary.length - 1; i >= 0; i--) 
				 {
					if (binary[i] == 1)
					{
						dec = dec + (int) Math.pow(2, j);
					}
					j++;
				  }
				return dec;
			 }
}
