package Day42;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) {
			System.out.println("Element " + (i + 1) + ": ");
			numbers.add(sc.nextInt());
		}
		
		System.out.println("\nOriginal List: " + numbers);
		System.out.println("=".repeat(50));
		
		System.out.println("Even numbers (using Stream API):");
		numbers.stream()
			   .filter(num -> num % 2 == 0)
			   .forEach(num -> System.out.print(num + " "));
		
		System.out.println("\n" + "=".repeat(50));
		
		if (!numbers.isEmpty()) {
			int largest = numbers.stream()
							     .max(Integer::compareTo)
							     .get();
			System.out.println("Largest Number: " + largest);
		} else {
			System.out.println("List is empty!");
		}
		System.out.println("=".repeat(50));
		sc.close();
	}
}