package com.bridgelabz.designpatterns.mediator;

public class MediatorPatternDemo 
{
	public static void main(String[] args) 
	{
//use the user object to show the communication bet them
		
	      User robert = new User("Dinesh");
	      User john = new User("Vijay");

	      robert.sendMessage("Hi! Dinesh!");
	      john.sendMessage("Hello! Vijay!");
	}
}
