package Day29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			ArrayList<String> studentNames = new ArrayList<>();
			HashSet<String> courses = new HashSet<>();
			HashMap<Integer, String> rollToName = new HashMap<>();
			
			int nextRollNumber = 101;
			
			System.out.println(" Student Management System ");
			
			while (true) {
				System.out.println("\n Main Menu ");
				System.out.println("1. Add New Studnet");
				System.out.println("2. Add New Course");
				System.out.println("3. View All Students (ArrayList)");
				System.out.println("4. View Unique Courses (HashSet)");
				System.out.println("5. View Roll Number Mapping (HashMap)");
				System.out.println("6. Show Integrated Report");
				System.out.println("7. Exit");
				System.out.println("\n Enter Your choice (1-7): ");
				
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
					case 1:
						System.out.print("Enter studnet name: ");
						String name = sc.nextLine().trim();
						
						if (!name.isEmpty()) {
							studentNames.add(name);
							rollToName.put(nextRollNumber, name);
							System.out.println(" Student added successfully!");
							System.out.println(" Roll Number: " + nextRollNumber);
							nextRollNumber++;
						} else {
							System.out.println(" Name cannot be empty!");
						}
						break;
						
					case 2:
						System.out.println("Enter course Name: ");
						String course = sc.nextLine().trim();
						
						if (courses.add(course)) {
							System.out.println(" Course added successfully!");
						} else {
							System.out.println(" Course already exists (HashSet prevents duplicates)");
						}
						break;
						
					case 3:
						System.out.println("\n Studnet Names (ArrayList):");
						if (studentNames.isEmpty()) {
							System.out.println(" No students yet. ");
						} else {
							for (int i = 0; i < studentNames.size(); i++) {
								System.out.println("  " + (i+1) + ". " + studentNames.get(i));
							}
						}
						System.out.println("Total students: " + studentNames.size());
						break;
						
					case 4:
						System.out.println("\nUnique Courses (HashSet): ");
						if (courses.isEmpty()) {
							System.out.println(" No courses yet.");
						} else {
							for (String c : courses) {
								System.out.println(" . " + c);
							}
						}
						System.out.println("Total unique courses: " + courses.size());
						break;
						
					case 5:
						System.out.println("\nRoll Number -> Student Name (HashMap):");
						if (rollToName.isEmpty()) {
							System.out.println(" No students registered yet.");
						} else {
							for (Map.Entry<Integer, String> entry : rollToName.entrySet()) {
								System.out.println(" Roll " + entry.getKey() + " -> " + entry.getValue());
							}
						}
						break;
						
					case 6:
						System.out.println("\n Integrated Report ");
						System.out.println("Students in ArrayList: " + studentNames.size());
						System.out.println("Unique Courses in HashSet: " + courses.size());
						System.out.println("Studnets in HashMap: " + rollToName.size());
						
						System.out.println("\n Students who are in both ArrayList and HashMap: ");
						for (String sName : studentNames) {
							if (rollToName.containsValue(sName)) {
								System.out.println("  " + sName);
							}
						}
						break;
						
					case 7:
						System.out.println("\n Thank you for using Student Management System! ");
						sc.close();
						return;
						
					default:
						System.out.println(" Invalid choice! Please try again.");
				}
			}
		}
	}