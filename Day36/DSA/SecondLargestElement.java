package Day36.DSA;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		if ( n < 2) {
			System.out.println("Array must have at least 2 elements.");
			return;
		}
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}
		
		if (second == Integer.MIN_VALUE) {
			System.out.println("No second largest element found (all elements are same).");
		} else {
			System.out.println("Second Largest Element: " + second);
		}
		sc.close();
	}
}