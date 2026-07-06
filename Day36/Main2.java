package Day36;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "mango", "kiwi", "orange"));
		System.out.println("Strings with length greater than 5:");
		
		fruits.stream()
			  .filter(s -> s.length() > 5)
			  .forEach(System.out::println);
		
		System.out.println("\nAll strings in uppercase:");
		
		fruits.stream()
			  .map(String::toUpperCase)
			  .forEach(System.out::println);
	}
}
