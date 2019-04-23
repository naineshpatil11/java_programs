 package com.bridgelabz.designpatterns.adapter1;

public class BirdAdapter implements ToyDuck
{
	// You need to implement the interface your 
    // client expects to use. 
    Bird bird; 
    public BirdAdapter(Bird bird) 
    { 
        // we need reference to the object we 
        // are adapting 
        this.bird = bird; 
    } 
  
    public void squeak() 
    { 
        // translate the methods appropriately 
        bird.makeSound(); 
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
