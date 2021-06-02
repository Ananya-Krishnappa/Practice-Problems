package com.bridgelabz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Arrays {

	public static void main(String args[]) {

		int row, col, i, j;
		int arr[][] = new int[10][10];
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter row for the array (max 10) : ");
		row = scan.nextInt();
		System.out.print("Enter column for the array (max 10) : ");
		col = scan.nextInt();

		System.out.println("Enter " + (row * col) + " Array Elements : ");

		try {
			PrintWriter out = new PrintWriter(new File("outputPrintWriter.txt"));
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					arr[i][j] = scan.nextInt();
					out.print(arr[i][j]);
				}
			}
			out.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		/*
		 * try { OutputStream outputStream = new
		 * FileOutputStream("outputStreamWriter.txt"); Writer outputStreamWriter = new
		 * OutputStreamWriter(outputStream); for (i = 0; i < row; i++) { for (j = 0; j <
		 * col; j++) { arr[i][j] = scan.nextInt(); outputStreamWriter.write(arr[i][j]);
		 * } } outputStreamWriter.close(); } catch (Exception e) { e.getMessage(); }
		 */

		/*
		 * for (i = 0; i < row; i++) { for (j = 0; j < col; j++) { arr[i][j] =
		 * scan.nextInt(); } }
		 * 
		 * System.out.print("The Array is :\n"); for (i = 0; i < row; i++) { for (j = 0;
		 * j < col; j++) { System.out.print(arr[i][j] + "  "); } System.out.println(); }
		 */
		System.exit(0);
	}
}
