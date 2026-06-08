package basic.Day08;

import java.util.Scanner;

public class Average {
	
	public static double calculateAverage(int[] array) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (double) sum / array.length;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		double average = calculateAverage(array);
		System.out.println("The average of the array elements is: " + average);
		sc.close();
	}
}