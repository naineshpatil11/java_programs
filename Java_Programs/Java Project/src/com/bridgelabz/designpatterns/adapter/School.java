package com.bridgelabz.designpatterns.adapter;

public class School 
{
	public static void main(String[] args) 
	{
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("Big tired about writing assignment ");
	}
}