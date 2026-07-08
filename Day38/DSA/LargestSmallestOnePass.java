package Day38.DSA;

import java.util.Scanner;

public class LargestSmallestOnePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest = " + largest);
		System.out.println("Smallest = " + smallest);

		sc.close();
	}

}
