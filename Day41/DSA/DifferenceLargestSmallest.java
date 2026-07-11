package Day41.DSA;

import java.util.Scanner;

public class DifferenceLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		if (n <=0) {
			System.out.println("Array must have at least one element.");
			sc.close();
			return;
		}
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		int diff = max - min;
		
		System.out.println("Largest element: " + max);
		System.out.println("Smallest element: " + min);
		System.out.println("Difference: " + diff);
		
		sc.close();
	}
}