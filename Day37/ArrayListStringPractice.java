package Day37;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "python", "c", "spring", "sql"));
		System.out.println("\n Strings with length equal to 4 or greater than 4: ");
		languages.stream()
				 .filter(s -> s.length() >= 4)
				 .forEach(System.out::println);
		
		System.out.println("\n String in uppercase: ");
		languages.stream()
			     .map(String::toUpperCase)
			     .forEach(System.out::println);
	}
}
