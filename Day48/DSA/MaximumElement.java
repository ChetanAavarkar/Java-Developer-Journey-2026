package Day48.DSA;

import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int largest = 0;
		System.out.println("Enter " + n + " integers");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
			
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("Maximum element is: " + largest);
	}
}
