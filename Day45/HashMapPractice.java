package Day45;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Chetan");
		hm.put(102,  "Ram");
		hm.put(103, "Priya");
		
		System.out.println("Initial HashMap contents:");
		printMap(hm);
		
		System.out.println("Do you want to add more entries? (yes/no): ");
		String choice = sc.nextLine().trim().toLowerCase();
		
		while (choice.equals("yes")) {
			try {
				System.out.println("Enter key: ");
				int key = Integer.parseInt(sc.nextLine().trim());
				
				System.out.println("Enter value: ");
				String value = sc.nextLine().trim();
				hm.put(key, value);
				System.out.println("Entry added successfully!");
			} catch (NumberFormatException e) {
				System.out.println("Invalid key! Please enter a valid integer.");
			}
			
			System.out.println("Add another entry? (yes/no): ");
			choice = sc.nextLine().trim().toLowerCase();
		}
		
		System.out.println("\nFinal HashMap contents:");
		printMap(hm);
		sc.close();
	}
	private static void printMap(HashMap<Integer, String> hm) {
		if (hm.isEmpty()) {
			System.out.println("HashMap is empty.");
			return;
		}
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}