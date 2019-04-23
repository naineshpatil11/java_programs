package com.bridgelabz.objectoriented.commercialdataprocessing;

import java.util.EmptyStackException;

public class StackMethodasLinkedList7 
{
	int length;
	Node top;
	
	public StackMethodasLinkedList7()
	{
		
	}
	public void show()
	{
		Node node = new Node();
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public String push(String data)
	{
		Node node = new Node(data, null);
		node.next = top;
		top = node;
		length++;
		return node.data;	
	}
	
	public String peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.data;
		
	}
	public boolean isEmpty() 
	{
		if(length == 0)
		{
			return true;
		}
		return false;
	}
	public String pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		String result = top.data;
		top = top.next;
		length--;
		return result;	
	}	
}
