package Day51.DSA;

import java.util.Scanner;

public class PositiveNegativeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int countPositive = 0;
		int countNegative = 0;
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > 0) {
				countPositive++;
			} else {
				countNegative++;
			}
		}
		
		System.out.println("Positive = " + countPositive);
		System.out.println("Negative = " + countNegative);
	}
}