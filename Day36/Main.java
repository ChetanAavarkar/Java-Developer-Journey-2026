package Day36;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 25, 30, 7, 45, 18));
		System.out.println("Even numbers:");
		numbers.stream()
			   .filter(n -> n % 2 == 0)
			   .forEach(System.out::println);
		
		System.out.println("\n Numbers greater than 20:");
		numbers.stream()
			   .filter(n -> n > 20)
			   .forEach(System.out::println);
	}
}
