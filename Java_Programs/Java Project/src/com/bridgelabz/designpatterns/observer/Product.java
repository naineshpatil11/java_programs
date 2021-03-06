package com.bridgelabz.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject
{
	private String productName;
	private List<Observer> ListOfObserver = new ArrayList<Observer>();
	private boolean available;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<Observer> getListOfObserver() {
		return ListOfObserver;
	}
	public void setListOfObserver(List<Observer> listOfObserver) {
		ListOfObserver = listOfObserver;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
		if(available == true)
		{
			notifyObserver();
		}
	}
	@Override
	public void registerObserver(Observer observer) {
		ListOfObserver.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		ListOfObserver.remove(observer);
	}
	@Override
	public void notifyObserver() 
	{
		System.out.println("Notify all registered observer ,when product available");
		for(Observer observer : ListOfObserver)
		{
			observer.update(productName);
	    }
	}
}
