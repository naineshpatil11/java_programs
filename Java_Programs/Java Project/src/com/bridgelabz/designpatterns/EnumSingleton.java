package com.bridgelabz.designpatterns;

public class EnumSingleton 
{
	public static void main(String[] args) 
	{
		Abcde obj1 = Abcde.INSTANCE;
		obj1.i = 5;
		obj1.show();
		
		Abcde obj2 = Abcde.INSTANCE;
		obj2.i = 8;
		obj1.show();
	}
}
enum Abcde
{
	INSTANCE;
	int i;
	public void show()
	{	
		System.out.println(i);
	}
}