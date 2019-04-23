package com.bridgelabz.designpatterns;

public class EagerInitialization 
{
	public static void main(String[] args)
	{
		Abc obj2 = Abc.getInstance();
	}
}
class Abc
{
	static Abc obj = new Abc();
	private Abc()
	{
		//System.out.println("Instance get");
	}
	public static Abc getInstance()
	{
		return obj;
	}
}