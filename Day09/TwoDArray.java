package basic.Day09;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns: ");
		int columns = sc.nextInt();
		
		int[][] array = new int[rows][columns];
		
		System.out.println("enter elements of the array: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.println("Enter element at [" + i + "][" + j + "]:");
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nElements of 2D array:");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
