package Day45;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPrintKeyValuePractice {

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
		
		System.out.println("\nDo you want to search for a key? (yes/no):");
		String searchchoice = sc.nextLine().trim().toLowerCase();
		
		while (searchchoice.equals("yes")) {
			try {
				System.out.println("Enter key  to search: ");
				int searchkey = Integer.parseInt(sc.nextLine().trim());
				
				if (hm.containsKey(searchkey)) {
					System.out.println("Key" + searchkey + " exists in the HashMap!");
					System.out.println("Value for key " + searchkey + " is: " + hm.get(searchkey));
				} else {
					System.out.println(" Key " + searchkey + " does not exist in the HashMap.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid key! Please enter a valid integer.");
			}
			
			System.out.println("Search another key? (yes/no): ");
			searchchoice = sc.nextLine().trim().toLowerCase();
		}
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

