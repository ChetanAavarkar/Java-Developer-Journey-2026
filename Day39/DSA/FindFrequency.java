package Day39.DSA;

import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the number to find its frequency: ");
		int target = sc.nextInt();
		
		int frequency = 0;
		for (int value : arr) {
			if (value == target) {
				frequency++;
			}
		}
		System.out.println("Frequency = " + frequency);
		sc.close();
	}
}
