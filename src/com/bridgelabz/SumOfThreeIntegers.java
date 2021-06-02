package com.bridgelabz;

import java.util.Scanner;

public class SumOfThreeIntegers {
	static void findTriplets(int[] arr, int n) {
		int count = 0;
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						found = true;
						count++;
					}
				}
			}
		}
		System.out.println("Number of triplets found " + count);

		if (found == false)
			System.out.println(" not exist ");

	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		/* int arr[] = { 0, -1, 2, -3, 1 }; */
		int n = arr.length;
		findTriplets(arr, n);

	}
}