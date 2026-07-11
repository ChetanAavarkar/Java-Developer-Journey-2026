package Day41.DSA;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		if (n < 2) {
			System.out.println("At least 2 elements are required to find the second smallest.");
			sc.close();
			return;
		}
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int secondsmallest = findSecondSmallest(arr);
		
		if (secondsmallest == Integer.MAX_VALUE) {
			System.out.println("No second smallest element exists");
		} else {
			System.out.println("Second smallest element: " + secondsmallest);
		}
		sc.close();
	}
	
	public static int findSecondSmallest(int[] arr) {
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if (num < smallest) {
				secondsmallest = smallest;
				smallest = num;
			} else if (num > smallest && num < secondsmallest) {
				secondsmallest = num;
			}
		}
		return secondsmallest;
	}
}
