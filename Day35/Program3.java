package Day35;

import java.util.ArrayList;

public class Program3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("JavaScript");
		
		languages.stream()
			    .map(String::toUpperCase)
			    .forEach(System.out::println);
	}
}