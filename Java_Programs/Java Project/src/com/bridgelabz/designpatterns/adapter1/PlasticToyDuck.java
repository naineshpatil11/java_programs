package com.bridgelabz.designpatterns.adapter1;

public class PlasticToyDuck implements ToyDuck
{
	/*
	 * String swing; public PlasticToyDuck(String swing) { super(); this.swing =
	 * swing; }
	 */
	public void squeak() 
    { 
        System.out.println("Squeak"); 
    }
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	} 
} 
