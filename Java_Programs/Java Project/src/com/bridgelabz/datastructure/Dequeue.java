/*
 * Purpose: To implement the all methods of Palindrome class.
 * 
 * @author: Nainesh R Patil.
 */
package com.bridgelabz.datastructure;

import java.util.Arrays;

public class Dequeue<T> 
{
	int size;	
	Object s[];		 
	int front,rear = -1;

	public Dequeue(int size)
	{
		this.size=size;
		s=new Object[size];
	}


	//dequeue follows insert from both end
	//to add element from FRONT end 
	
	boolean frontenqueue(Object o)
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return false;
		}
		if(front-1>=0)   
                       //as arr start index is--0 , so front should not exceed 0
		{
			s[front-1]= 0;
			front--;     
			return true;
		}	
	   return false;
	}
	
	//insert both end & remove from both end 
	// so to remove element from the Front end 

	public Object frontdequeue() //remove element from front here
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		
	    Object e= s[front];
	    
	    front++;
		return e;
	}
	
	//insert both end & remove from both end 
	// to check if the array(dqueue ) is empty
	
	boolean isEmpty()
	{
		if(rear==-1 && front==-1)
		{
			return true;			
			//System.out.println("Queue is empty");	
		}	
		else 
		return false;	
	}
	
	
	//insert both end & remove from both end 
	//to add element from rear end 
	
	
	
	//insert both end & remove from both end 
	//to add element from rear side
	
	public boolean rearenqueue(Object o)
	{
		if(rear==size-1)
		{
			System.out.println("Stack overflow");
			return false;
		}
		s[++rear]= o;
		return true;
	}
	
	//insert both end & remove from both end 
	//so to remove element from the Front end 
	
	Object reardequeue() //remove element from front 
	{   
		if(rear==-1)
		{
			System.out.println("Queue is underflow ");
		} 
	    Object e= s[rear];
	    rear--;
		return e;
	}

		// print the DEQUEUE 
	
    //public String toString()
    {
	//	return "Myqueue [size=" + size + ", s=" + Arrays.toString(s) + ", front=" + front + ", rear=" + rear + "]";
	}
}
