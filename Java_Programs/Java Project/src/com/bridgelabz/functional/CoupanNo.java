package com.bridgelabz.functional;

import java.util.Random;
import java.util.Scanner;

public class CoupanNo {
	
	static int totalCount = 0;
	static int arr[];

	public static void main(String[] args) {
		getUserInput();
		getRandomNumber();
		printArray();
	}

	private static void printArray() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void getRandomNumber() {
		arr = new int[totalCount];
		int count = 0;
		while (count < totalCount) {
			System.out.println("count:" + count);
			Random random = new Random();
			int randomNo = random.nextInt(7);
			if (checkDistinct(randomNo)) {
				arr[count] = randomNo;
				count++;
			}
		}
	}

	private static boolean checkDistinct(int random) {
		for (int i : arr) {
			if (random == i) {
				return false;
			}
		}
		return true;
	}

	private static void getUserInput() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total ramdom number: ");
		totalCount = scanner.nextInt();

	}
}
