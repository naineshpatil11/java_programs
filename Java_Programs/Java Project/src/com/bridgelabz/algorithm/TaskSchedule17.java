package com.bridgelabz.algorithm;

import java.util.Scanner;

public class TaskSchedule17 
{
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter no of task: ");
			int t = s.nextInt();
			int[] dead = new int[t];
			int[] min = new int[t];
			for (int i = 0; i < min.length; i++) 
			{
				System.out.println("Task " + i + " time");
				min[i] = s.nextInt();
				System.out.println("Task " + i + " deadline");
				dead[i] = s.nextInt();
			}
		}
}
