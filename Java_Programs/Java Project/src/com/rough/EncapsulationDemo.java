package com.rough;

import java.util.Scanner;

class Methods 
{
	private int id;
	private String name;
	private double salary;

	/*
	 * public Methods(int id, String name, double salary) { super(); this.id = id;
	 * this.name = name; this.salary = salary; }
	 */
	
	
	  public Methods() {
	  
	  this.id = id; this.name = name; this.salary = salary; }
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class EncapsulationDemo
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id, name and salary ");
		int id = scanner.nextInt();
		String name = scanner.next();
		double salary = scanner.nextDouble();
		
		Methods obj = new Methods();
		obj.setId(id);
		obj.setName(name);
		obj.setSalary(salary);
		System.out.println("Datails: ");
		System.out.println(obj.getId() +"\t"+obj.getName()+"\t"+obj.getSalary());
		scanner.close();
	}
}
