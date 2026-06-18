package Day18;

public class ArrayExceptionDemo {
	
	public static void main(String[] args) {
		
		try {
			int arr[] = {1, 2, 3};
			
			System.out.println("Array created successfully.");
			System.out.println("Array length: " + arr.length);
			
			System.out.println("Accessing arr[10]...");
			int value = arr[10];
			
			System.out.println("Value at index 10: " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds!");
			System.out.println("Exception message: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Some other error occurred: " + e.getMessage());	
		} finally {
			System.out.println("Program execution completed.");
		}
	}
}
