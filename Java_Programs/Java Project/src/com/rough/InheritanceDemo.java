package com.rough;

import java.util.Scanner;

class Shape
{
	void show(double area)
	{
		//double area = 0;
		System.out.println("Area is "+area);
	}
}
class Circle extends Shape
{
	double calArea( double r)
	{
		//double area = 3.14 * r *r;
		return 3.14 * r *r;
		//System.out.println(area);

	}
}
public class InheritanceDemo 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value: ");
		double value = scanner.nextDouble();
		
		Circle obj= new Circle();
		double area =  obj.calArea(value);
		
		//Shape disp = new Shape();
		obj.show(area);
	}
}
