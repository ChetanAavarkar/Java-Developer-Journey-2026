package Day53.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for (int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		
		System.out.println("Duplicte elements:");
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		sc.close();
 	}
}