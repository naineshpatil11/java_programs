package com.bridgelabz.designpatterns;

public class LazyInitialization 
{
	public static void main(String[] args)
	{
		Ab obj = Ab.getInstance();
		Ab obj1 = Ab.getInstance();
	}
}
class Ab
{
	static Ab obj;
	private Ab()
	{
		System.out.println("Instance get");
	}
	public static Ab getInstance()
	{
		if(obj == null)
		{
			obj = new Ab();
		}
		return obj;
	}
}
