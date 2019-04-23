package com.bridgelabz.designpatterns.visitor;

public interface ComputerPart 
{
	public void accept(ComputerPartVisitor computerPartVisitor);
	
}
