package basic.Day09;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements for the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter the elements for the array: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n/2; i++) {
			int temp = array[i];
			array[i] = array[n - 1 - i];
			array[n - 1 - i] = temp;
		}
		System.out.println("Reversed array: ");
		for(int i = 0; i < n; i++) {
			System.out.println(array[i] + " ");
		}
		sc.close();
	}
}
