package Day40.DSA;

import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers separated by space (e.g. 1 2 3 5): ");
		String n = sc.nextLine().trim();
		
		if (n.isEmpty()) {
			System.out.println("No numbers entered.");
			sc.close();
			return;
		}
		
		String[] parts = n.trim().split("\\s+");
		int[] arr = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			arr[i] = Integer.parseInt(parts[i]);
		}
		
		int missing = findMissingNumber(arr);
		System.out.println("Missing number: " + missing);
		
		sc.close();
	}
	
	public static int findMissingNumber(int[] arr) {
		if (arr.length == 0) return -1;
		
		int min = arr[0];
		int max = arr[0];
		long actualsum = 0;
		
		for (int num : arr) {
			if (num < min) min = num;
			if (num > max) max = num;
			actualsum += num;
		}
		
		int n = max - min + 1;
		long sum = (long) n * (min + max) / 2;
		
		return (int) (sum - actualsum);
	}
}
