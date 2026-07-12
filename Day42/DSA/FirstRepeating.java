package Day42.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> freq = new HashMap<>();
		
		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		
		int result = -1;
		for (int num : arr) {
			if (freq.get(num) > 1) {
				result = num;
				break;
			}
		}
		
		if (result != -1) {
			System.out.println("First repeating element: " + result);
		} else {
			System.out.println("No repeating element");
		}
		sc.close();
	}
}