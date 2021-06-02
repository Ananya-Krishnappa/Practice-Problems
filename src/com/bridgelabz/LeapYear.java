package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();
		if (year % 400 == 0) {
			System.out.println("leap year");
		} else if (year % 100 != 0) {
			System.out.println("not a leap year");
		} else if (year % 4 == 0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}
}
