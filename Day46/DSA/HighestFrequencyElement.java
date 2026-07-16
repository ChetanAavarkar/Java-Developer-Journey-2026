package Day46.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		
		int maxFreq = 0;
		int result = -1;
		
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() > maxFreq) {
				maxFreq = entry.getValue();
				result = entry.getKey();
			}
		}
		
		if (result != -1) {
			System.out.println("Element with highest frequency: " + result + " (appears " + maxFreq + " times)");
		} else {
			System.out.println("Array is empty");
		}
		sc.close();
	}
}