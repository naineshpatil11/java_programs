package com.bridgelabz.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
	private String shopename;
	List<Book> book = new ArrayList<>();
	
	public String getShopename() {
		return shopename;
	}
	public void setShopename(String shopename) {
		this.shopename = shopename;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	public void loadData()
	{
		for(int i = 0; i < 10; i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book"+i);
			getBook().add(b);
		}
	}
	@Override
	public String toString() 
	{
		return "BookShop:- shopename=" + shopename + ", book=" + book + "\n";
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException 
	
	{
		BookShop shop = new BookShop();
		for(Book b = this.getBook())
		{
			shop = getBook().add(b);
		}
		return shop;
	}
	
	
}
