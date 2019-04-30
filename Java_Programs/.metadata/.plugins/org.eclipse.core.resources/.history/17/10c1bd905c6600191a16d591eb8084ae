package com.bridgelabz.designpatterns.prototype;

public class Demo 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		BookShop bs = new BookShop();
		bs.setShopename("Royalty");
		bs.loadData();
		
		System.out.println(bs);
		
		
		BookShop bs1 = bs.clone();
		bs1.setShopename("Bazar");
		bs.getBook().remove(2);
		//bs1.loadData();
		System.out.println(bs1);
		
		
	}
}
