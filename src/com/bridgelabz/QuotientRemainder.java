package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend");
		int dividend = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter divisor");
		int divisor = sc1.nextInt();
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}
