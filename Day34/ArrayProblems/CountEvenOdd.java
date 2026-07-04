package Day34.ArrayProblems;

import java.util.Scanner;

public class CountEvenOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " integers:");
		for(int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		int evenCount = 0;
		int oddCount = 0;
		
		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		System.out.println("Even = " + evenCount);
		System.out.println("Odd = " + oddCount);
		
		sc.close();
	}
}
