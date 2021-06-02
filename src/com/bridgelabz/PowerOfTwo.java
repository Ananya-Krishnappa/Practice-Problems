package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number between 0 to 31");
		int userInput = scanner.nextInt();
		if (userInput >= 0 && userInput <= 31) {
			printTable(userInput);
		} else {
			System.out.println("Please enter valid input");
		}
	}

	private static void printTable(int userInput) {
		for (int i = 0; i <= userInput; i++) {
			System.out.print((int) Math.pow(2, i) + " ");
		}
	}
}
