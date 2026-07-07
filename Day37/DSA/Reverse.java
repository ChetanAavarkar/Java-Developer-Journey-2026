package Day37.DSA;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integer");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] rev = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			rev[i] = arr[arr.length - 1 - i];
		}
			
		for (int value : rev) {
			System.out.print(value + " ");
		}
	}
}
	