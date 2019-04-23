package com.bridgelabz.designpatterns.observer;

public interface Subject 
{
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
};
