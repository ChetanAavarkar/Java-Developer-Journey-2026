package Day54.DSA;

import java.util.Scanner;

public class FrequencyCounter {

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
		
		System.out.print("Enter the number to find frequency: ");
		int target = sc.nextInt();
		
		int frequency = 0;
		for (int num : arr) {
			if (num == target) {
				frequency++;
			}
		}
		
		System.out.println("Frequency of " + target + " = " + frequency);
		sc.close();
	}
}