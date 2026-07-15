package Day45;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapSearchPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Chetan");
		hm.put(102,  "Ram");
		hm.put(103, "Priya");
		
		int choice = 0;
		
		do {
			System.out.println("1. Add entries");		
			System.out.println("2. Search by key");
			System.out.println("3. Print all keys");
			System.out.println("4. Print all values");
			System.out.println("5. Print full HashMap");
			System.out.println("6. Exit");
			System.out.println("Enter your choice (1-6): ");
			
			try {
				choice = Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Invalid choice! Please enter a number between 1 and 6.");
				continue;
			}
			
			switch (choice) {
				case 1:
					addEntries(sc, hm);
					break;
					
				case 2:
					searchByKey(sc, hm);
					break;
					
				case 3:
					printAllKeys(hm);
					break;
					
				case 4:
					printAllValues(hm);
					break;
					
				case 5:
					System.out.println("\nHashMap contents:");
					printMap(hm);
					break;
					
				case 6:
					System.out.println("Existing program");
					break;
					
				default:
					System.out.println("Invalid choice! Please enter a number between 1 and 6.");
			}
		} while (choice != 6);
		sc.close();
	}
	
	private static void addEntries(Scanner sc, HashMap<Integer, String>hm) {
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
	}
	
	private static void searchByKey(Scanner sc, HashMap<Integer, String>hm) {
		System.out.println("\nDo you want to search for a key? (yes/no):");
		String searchchoice = sc.nextLine().trim().toLowerCase();
		
		while (searchchoice.equals("yes")) {
			try {
				System.out.println("Enter key  to search: ");
				int searchkey = Integer.parseInt(sc.nextLine().trim());
				
				if (hm.containsKey(searchkey)) {
					System.out.println("Key" + searchkey + " exists.");
				} else {
					System.out.println(" Key " + searchkey + " does not exist in the HashMap.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid key! Please enter a valid integer.");
			}
			
			System.out.println("Search another key? (yes/no): ");
			searchchoice = sc.nextLine().trim().toLowerCase();
		}
	}
	
	private static void printAllKeys(HashMap<Integer, String> hm) {
		if (hm.isEmpty()) {
			System.out.println("HashMap is empty. No keys to print.");
			return;
		}
		
		Set<Integer> keys = hm.keySet();
		System.out.println("All keys:");
		for (Integer key : keys) {
			System.out.println(key);
		}
	}
	
	private static void printAllValues(HashMap<Integer, String> hm) {
		if (hm.isEmpty()) {
			System.out.println("HashMap is empty. Np values to print.");
			return;
		}
		
		Collection<String> values = hm.values();
		System.out.println("All values:");
		for (String value : values) {
			System.out.println(value);
		}
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