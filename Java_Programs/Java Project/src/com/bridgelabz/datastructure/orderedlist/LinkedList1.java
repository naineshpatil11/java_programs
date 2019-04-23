/*
 * Purpose: This class include the methods to search element,remove element, insert element and show 
 * 			elements.
 * @author: Nainesh R Patil.
 */
package com.bridgelabz.datastructure.orderedlist;

public class LinkedList1
{
	Node head;
	Node p1,p2;

	public void add(int data) {
		Node node = new Node(data, null);
		
		 // When list is empty
		if (head == null)
		{
			head = node;
		}
		else 
		{
			 //When there is a single element in LinkedList
			if (head.next == null) 
			{
				if (head.data > node.data)
				{
					node.next = head;
					head = node;
				} 
				else 
				{
					head.next = node;
				}
			} 
			else {
				 //When there is a more then two element in LinkedList
				 
				p1 = head;
				p2 = p1.next;
				while (p1.next != null) {
					
					if(p1.data > node.data && p1 == head) {
						node.next = head;
						head = node;
					}
					
					if (p1.data < node.data && p2.data > node.data) {
						node.next = p1.next;
						p1.next = node;
					}
					if (p2.next == null && p2.data < node.data) {
						p2.next = node;
					}

					p1 = p2;
					p2 = p1.next;
				}
			} 
		} 
}	
	public void remove(int data) {
		Node ptr1, ptr2;
		ptr1 = ptr2 = head;
		if (ptr1 == null) {
			System.err.println(" Underflow ");
		} else {
			if (ptr1.next == null) {
				head = null;
			}
			while (ptr1.next != null) {
					if (ptr1 == ptr2 && ptr2.data == data) {
						head = ptr1.next;
					}
					if (ptr2.data == data) {
						ptr1.next = ptr2.next;
					}
					ptr1 = ptr2;
					ptr2 = ptr1.next;
			}
		}

	}

	public boolean search(int num)
	{
		Node temp = head;
		do {
			if(temp.data == num)
			{
				return true;
			}
			temp = temp.next; 
		}
		while(temp.next != null);
			if(temp.data == num)
			{
				return true;
			}
			return false;
		
	}
	
	public boolean isEmpty() {
		if(this.head == null)
			return true;
      return false;
	}
	public void show() {
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else {
			Node temp;
			temp = head;
			while (temp.next != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.print(temp.data+" ");
		}
	}	
}
