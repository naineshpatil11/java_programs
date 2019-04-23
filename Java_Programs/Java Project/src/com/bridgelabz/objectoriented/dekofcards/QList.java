package com.bridgelabz.objectoriented.dekofcards;

public interface QList<T> 
{
	public void enqueue(T element) ;
	public T dequeue();
	public boolean isEmpty();
	public int size();

}
