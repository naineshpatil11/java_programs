package com.bridgelabz.datastructure.unordered;
//import com.rough.Node;

public class LinkedList 
{
		Node head;
		public void insert(String data) 
		{
		
			Node node = new Node();
			node.data = data;
			node.next = null;
			if(head == null)
			{
				head = node;
			}
			else
			{
				Node n = head;
				while(n.next != null)
				{
					n = n.next;
				}
				n.next = node;
			}
			
		}
		public void show()
		{
			Node node = head;
			
			while(node.next != null)
			{
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}
		public boolean search(String str)  
		{
			Node temp = head;
				while(temp.next != null) 
				{
					if(temp.data.equalsIgnoreCase(str))
					{
						return true;
					} 
					temp = temp.next;
				}
				if(temp.data.equalsIgnoreCase(str)) 
				{
					return true;
				}
			return false;
		}
		public void remove(String word) 
		{
			Node n1,n2;
			n1 = n2 = head;
			if(n1 == null) {
				
			}
			else 
			{
				while(n1.next != null)
				{
					if(n1.next == null) 
					{
						head = null;
					}
					else
					{
						if(n1 == n2 && n2.data.equalsIgnoreCase(word))
							head = n1.next;	
					}
					if(n2.data.equalsIgnoreCase(word))
					{
						n1.next = n2.next;				
					}
					n1 = n2;
					n2 = n1.next;
				}
			}
		}                     
}
