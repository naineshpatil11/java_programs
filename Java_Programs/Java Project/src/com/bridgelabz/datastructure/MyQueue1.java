package com.bridgelabz.datastructure;

import java.util.Arrays;

public class MyQueue1<T>
{
		int size;
		Object s[];		 
		int front,rear = -1;
		
		public MyQueue1(int size)
		{
			this.size = size;
			s = new Object[size];
		}
		public MyQueue1() 
		{
			
		}

		/**
		 * to check if the array(queue) is empty
		 */
		public boolean isempty()
		{
			if(rear == -1 && front == -1)
			{
				return true;			
				//System.out.println("Queue is empty");
			}	
			else 
				return false;	
		}

		/**
		 * to add element from rear end 
		 */
		public boolean enqueue(Object o)
		{
			if(rear == size - 1)
			{
				System.out.println("Stack overflow");
				return false;
			}
			s[++rear] = o;
			return true;
		}
		/**
		 * so to remove element from the Front end 
		 */
		public Object dequeue()
		{   
			if(front ==-1)
			{
				System.out.println("Queue is underflow ");
			} 

			Object e= s[front];

			front++;
			return e;
		}
		/**
		 * print the queue 
		 * @return : String
		 *  
		 */
		public String toString()
		{
			return "Myqueue [size=" + size + ", s=" + Arrays.toString(s) + ", front=" + front + ", rear=" + rear + "]";
		}

		public int size() 
		{
			return size;
		}
		

	}

