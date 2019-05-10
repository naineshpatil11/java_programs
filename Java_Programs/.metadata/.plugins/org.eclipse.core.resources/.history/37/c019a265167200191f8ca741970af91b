/*
 * Purpose: Read the arithmatic expression and check wheather is balenced or not.
 * @author: Nainesh R Patil.
 * 
 */
package com.bridgelabz.datastructure;

public class BalancedParentheses 
{
	static boolean check(String s) 
	{
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if (c == '(')
				st.push(s.charAt(i));
			else if (c == ')')
				st.pop();
		}
		return st.isEmpty();
}
	public static void main(String[] args)
	{	
	String str="(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
	boolean result = false;
	if(result==check(str))
	{
		System.out.println("Balenced");
	}
	else
		System.out.println("Not balenced");
	//System.out.println(result);
	
	}
}
