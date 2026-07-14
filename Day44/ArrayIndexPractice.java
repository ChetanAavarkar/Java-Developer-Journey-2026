package Day44;

import java.util.Scanner;

public class ArrayIndexPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter array elements: ");
			int n = sc.nextInt();
			
			if (n <= 0) {
				System.out.println("Error: Array size must be positive.");
				sc.close();
				return;
			}
			
			int[] arr = new int[n];
			System.out.println("Enter " + n + " integers");
			for(int i = 0; i < n; i++) {
				System.out.println("Element at index " + i + ": ");
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Array: [");
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i]);
				if (i < n - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
			System.out.println("Valid indices: 0 to " + (n - 1));
				
			System.out.println("Enter array index you want tp access: ");
			int index = sc.nextInt();
				
			int value = arr[index];
			System.out.println("Value at index " + index + ": " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index out of bounds!");
			System.out.println("You tried to access an index that doesn't exist in the array.");
		} finally {
			sc.close();
		}
		System.out.println("Program continues after handling the exception...");
		}
	}
