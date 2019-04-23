package com.bridgelabz.designpatterns;

public class ThreadSafeSingleton 
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable() 
		{
			//@Override
			public void run() 
			{
				Abcd obj = Abcd.getInstance();
		    }
		});
		Thread t2 = new Thread(new Runnable() 
		{
			//@Override
			public void run() 
			{
				Abcd obj = Abcd.getInstance();
		    }
		});
		t1.start();
		t2.start();  
	}
}
class Abcd
{
	static Abcd obj;
	private Abcd()
	{
		System.out.println("Instance get");
	}
	public static synchronized Abcd getInstance()
	{
		if(obj == null)
		{
			obj = new Abcd();
		}
		return obj;
	}
}
