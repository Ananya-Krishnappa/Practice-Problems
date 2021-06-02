package com.bridgelabz;

import java.util.Scanner;

public class HarmonicProg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		double result = 0.0;
		while (num > 0) {
			result = result + (double) 1 / num;
			num--;
			System.out.print(result + "  ");
		}
		System.out.println("");
		System.out.println("Output of Harmonic Series is " + result);
	}
}
