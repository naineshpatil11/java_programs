/*
 * Purpose: This class include the methods of HashingFunction class to add hash element,show element,
 * 			search element, and remove hash element.
 * @author: Nainesh R Patil.
 */
package com.bridgelabz.datastructure;
import com.bridgelabz.datastructure.orderedlist.LinkedList1;

public class Hashing6 
{
	LinkedList1[] list = new LinkedList1[10];
	
	
	//constructor for anitialising array
	public void Hashing() {
		for (int i = 0; i < list.length; i++) {
			list[i] = new LinkedList1();
		}
	}
	
	//method to add elemement at appropriate position
	public void addHash(int num) {
		int mod = num % 11;
		//System.out.println(mod);
		list[mod].add(num);
	}

	//to display hash element
	public void showHash() {
		for (int i = 0; i < list.length; i++) {
			System.out.print(i+" ");
			if(list[i].isEmpty()) {
				System.out.println(" Empty");
			}else {
				list[i].show();
			}
		}
	}

		// to search hash element
	public boolean search(int num) {
		 int mod = num % 11;
		 if(list[mod].search(num))
			 return true;
		return false;
	}
	
	// to remove hash element
	public void remove(int num) {
		int mod = num % 11;
		list[mod].remove(num);
	}
	
}

