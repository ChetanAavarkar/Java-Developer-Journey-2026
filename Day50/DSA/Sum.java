package Day50.DSA;

import java.util.Scanner;

public class Sum {

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
		
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}
}