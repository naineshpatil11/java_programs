package com.bridgelabz.designpatterns.facade;

public class Samsung implements MobileShop
{

	@Override
	public void modelNo() {
		System.out.println("Samsung Galaxy");
	}

	@Override
	public void price() {
		System.out.println("Rs.18,000");
	}

}
