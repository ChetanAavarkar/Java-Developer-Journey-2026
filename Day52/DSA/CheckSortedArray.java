package Day52.DSA;

import java.util.Scanner;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean isSorted = true;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}
		
		if (isSorted) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}
		sc.close();
	}
}