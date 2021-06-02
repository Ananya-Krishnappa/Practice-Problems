package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature and wind speed");
		double t = sc.nextInt();
		double v = sc.nextInt();
		double w = 0;
		double power = Math.pow(v, 0.16);
		if (Math.abs(t) <= 50 && v <= 120 && v >= 3) {
			w = 35.75 + 0.621 * t + (0.4275 * t - 35.75) * power;
			System.out.println("WindChill " + w);
		} else {
			System.out.println("Enter temperature value below 50 and wind speed in range 3 to 120");
		}
	}
}
