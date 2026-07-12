package Day42.DSA;

import java.util.Scanner;

public class FindNumberExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean found = false;
		
		System.out.println("Enter what you have to find?");
		int target = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		sc.close();
	}
}