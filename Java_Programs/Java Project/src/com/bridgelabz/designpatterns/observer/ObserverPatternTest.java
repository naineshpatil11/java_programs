package com.bridgelabz.designpatterns.observer;

public class ObserverPatternTest 
{
	public static void main(String[] args) 
	{
		Customer customer1 = new Customer();
		customer1.setCustomerName("Dinesh");
		
		Customer customer2 = new Customer();
		customer2.setCustomerName("vijay");
		
		Product iphone6 = new Product();  
		iphone6.setProductName("Apple Ihone 6");
		iphone6.setAvailable(false);
		
		iphone6.registerObserver(customer1);
		iphone6.registerObserver(customer2);
		
		//after few days phones available
		iphone6.setAvailable(true);
		
		 //customer wants to unregister
		iphone6.removeObserver(customer2);
		iphone6.setAvailable(true);
		
	}
}
