
 package com.bridgelabz.datastructure;

	public class LinkedList2 
	{
		Node2 head;
		public void insert(int data)
		{
			Node2 node = new Node2();
			node.data = data;
			node.next = null;
			if(head == null)
			{
				head = node;
			}
			else
			{
				Node2 n = head;
				while(n.next != null)
				{
					n = n.next;
				}
				n.next = node;
			}
		}
		/*public Node2 insertAt(Node2 head,Node2 newnode)
		{
			
			//Node2 node=new Node2();
			//node.data=data;
			if(head == null && head.data>=newnode.data)
			{
				newnode.next=head;
				head=newnode;
				return head;
				//data.next=head;
				//head=data;
			}
			  Node2 current=head;
				//current=head;
				while(current.next!=null && current.next.data<newnode.data)
				{
					current = current.next;
				}
					newnode.next=current.next;
					current.next=newnode;
					return head;
			}*/
		
		public boolean search(int n)
		{
			Node2 temp = head;
			while(temp.next != null)
			{
				if(temp.data == n)
				{
					return true;
				}
				temp = temp.next;
			}
			if(temp.data == n)
			{
				return true;
			}
			return false;
		}
		/*
		 * public boolean search(int str) { Node2 temp = head; while(temp.next != null)
		 * { if(temp.data.equals(str)); { return true; } temp = temp.next; }
		 * if(temp.data.equalsIgnoreCase(str)) { return true; } return false; }
		 */
		public void show()
		{
			Node2 node = head;
			
			while(node.next != null)
			{
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}
		
		public void remove(int word) 
		{
			Node2 n1,n2;
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
						if(n1 == n2 && n2.data == word)
							head = n1.next;	
					}
					if(n2.data == word)
					{
						n1.next = n2.next;				
					}
					n1 = n2;
					n2 = n1.next;
				}
			}
		}

	
		}                    	
	

