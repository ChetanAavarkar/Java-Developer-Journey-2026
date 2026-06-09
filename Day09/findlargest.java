package basic.Day09;

import java.util.Scanner;

public class findlargest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int largest = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		System.out.println(largest + " is largest element");

		sc.close();
	}
}
