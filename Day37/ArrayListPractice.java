package Day37;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 12, 18, 27, 40, 55));
		System.out.println("Odd Numbers:");
		numbers.stream()
			   .filter(n -> n % 2 != 0)
			   .forEach(System.out::println);
		
		System.out.println("\n Numbers greater than 20:");
		numbers.stream()
			   .filter(n -> n > 20)
			   .forEach(System.out::println);
	}
}
