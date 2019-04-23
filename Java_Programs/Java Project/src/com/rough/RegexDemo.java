package com.rough;

public class RegexDemo 
{
	static String data;
	public static void main(String[] args)
	{
		String data = "0Jack.123Mock.456Luck.789Harya";
		String result = data.replaceAll("\\D", "");
		System.out.println(result);
		
		data = "Lucky   Monkey      God  Jack";
		String[] result1 = data.split("\\s+");
		for (String string : result1) 
		{
			System.out.println(string);
		}
		 
	}
}
