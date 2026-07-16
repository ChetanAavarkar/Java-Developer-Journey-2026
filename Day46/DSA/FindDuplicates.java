package Day46.DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {

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
		
		List<Integer> duplicates = new ArrayList<>();
		Set<Integer> seen = new HashSet<>();
		
		for (int num : arr) {
			if (freqMap.get(num) > 1 && !seen.contains(num)) {
				duplicates.add(num);
				seen.add(num);
			}
		}
		
		System.out.print("Duplicates: ");
		if (duplicates.isEmpty()) {
			System.out.println("None");
		} else {
			for (int i = 0; i < duplicates.size(); i++) {
				System.out.print(duplicates.get(i));
				if (i < duplicates.size() - 1) {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}