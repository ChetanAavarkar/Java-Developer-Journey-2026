package Day38.DSA;

import java.util.Scanner;

public class ArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(isSorted(arr)) {
			System.out.println("Sorted");
		} else {
			System.out.println("Not Sorted");
		}
		
		sc.close();
	}
	public static boolean isSorted(int[] arr) {
		if (arr.length <= 1) {
			return true;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}