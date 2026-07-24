package Day54.DSA;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
		for (int num : arr) {
			uniqueSet.add(num);
		}
		
		System.out.print("Array after removing duplicates: ");
		for (int num : uniqueSet) {
			System.out.print(num + " ");
		}
		System.out.println();
		sc.close();
	}
}