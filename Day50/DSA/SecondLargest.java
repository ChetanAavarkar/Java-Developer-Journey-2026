package Day50.DSA;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		if (n < 2) {
			System.out.println("Array should have at least 2 elements!");
			sc.close();
			return;
		}
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}
		
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second largest element found (all elements are same)");
		} else {
			System.out.println("Second Largest = " + secondLargest);
		}
		sc.close();
	}
}