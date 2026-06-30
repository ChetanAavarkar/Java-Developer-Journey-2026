package Day30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> hm = new HashMap<>();
		
		while(true) {
			System.out.println(" Student Management Program ");
			System.out.println("1. Add Student");
			System.out.println("2. Search Student");
			System.out.println("3. Remove Student");
			System.out.println("4. Display Students");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			
			int choice;
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a number from 1 to 5.");
				continue;
			}
			
			switch (choice) {
				case 1:
					System.out.println("Enter Student ID: ");
					int addId;
					try {
						addId = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("Invalid ID.");
						break;
					}
					System.out.print("Enter Student Name: ");
					String addName = sc.nextLine();
					hm.put(addId, addName);
					System.out.println("Student added successfully.");
					break;
					
				case 2:
					System.out.print("Enter Student ID to search: ");
					int searchId;
					try {
						searchId = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("Invalid ID.");
						break;
					}
					if (hm.containsKey(searchId)) {
						System.out.println("Student Found: ID = " + searchId + ", Name = " + hm.get(searchId));
					} else {
						System.out.println("Student not found.");
					}
					break;
					
				case 3:
					System.out.println("Enter Student ID to remove: ");
					int removeId;
					try {
						removeId = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("Invalid ID.");
						break;
					}
					if (hm.remove(removeId) != null) {
						System.out.println("Student removed successfully.");
					} else {
						System.out.println("Student not found.");
					}
					break;
					
				case 4:
					if (hm.isEmpty()) {
						System.out.println("No student available.");
					} else {
						System.out.println(" Student List ");
						for (Map.Entry<Integer, String> entry : hm.entrySet()) {
							System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
						}
					}
					break;
					
				case 5:
					System.out.println("Exiting program. Goodbye!");
					sc.close();
					return;
					
				default:
					System.out.println("Invalid choice. Please select between 1 and 5.");
			}
		}	
	}
}
