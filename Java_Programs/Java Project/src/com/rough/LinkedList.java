package com.rough;

public class LinkedList 
{
	Node head;
	public void add(int data) 
	{
		Node node = new Node(data, null);
		if(head == null)
		{
			head = node;
		}
		
		Node p1,p2;
		int temp;
		p1 = head;
		p2 = p1.next;
		//p1 = p2 = head;
		while(p1.next != null)
		{
			if(p1.data > p2.data)
			{
				temp = p1.data;
				p1.data = p2.data;
				p2.data = temp;
			}
			p1 = p1.next;
		//	p1.next = data;
		}
	}

	public void show() 
	{
		Node temp;
		temp = head;
		if(head == null)
		{
			System.out.println("List is empty: ");
		}
		while(temp.next != null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
