package Day47.DSA;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		
		Integer firstUnique = null;
		for (int num : arr) {
			if (freqMap.get(num) == 1) {
				firstUnique = num;
				break;
			}
		}
		
		if (firstUnique == null) {
			System.out.println("No unique element found");
		} else {
			System.out.println("First unique element: " + firstUnique);
		}
		sc.close();
	}
}