package Day47.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers: ");
		int n = sc.nextInt();
		
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		
		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			int count = freqMap.getOrDefault(num, 0);
			freqMap.put(num, count + 1);
		}
		System.out.println("Frequencies:");
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		sc.close();
	}
}