package com.bridgelabz.designpatterns.facade;

public class Blackberry implements MobileShop
{

	@Override
	public void modelNo() {
		System.out.println("BlackBerry 9");
	}

	@Override
	public void price() {
		System.out.println("Rs.25,000");
	}
}
