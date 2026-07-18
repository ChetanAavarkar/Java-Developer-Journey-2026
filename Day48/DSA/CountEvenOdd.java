package Day48.DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();
		
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
			if (arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			} else {
				oddList.add(arr[i]);
			} 
		}
		
		System.out.println("\nEven numbers:");
		for (int num : evenList) {
			System.out.println(num);
		}
		
		System.out.println("\nOdd numbers:");
		for (int num : oddList) {
			System.out.println(num);
		}
		sc.close();
	}
}