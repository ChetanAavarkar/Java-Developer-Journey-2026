package Day38;

import java.util.ArrayList;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Spring");
		languages.add("SQL");
		languages.add("Python");
		languages.add("Git");
		
		System.out.println("\n strings which has length greater than 4 in uppercase:");
		languages.stream()
		         .map(String::toUpperCase)
				 .filter(s -> s.length() > 4)
				 .forEach(System.out::println);
		
		System.out.println("\nAll elements using method reference:");
		languages.forEach(System.out::println);
		
		System.out.println("\nAll elements using lambda expression:");
		languages.forEach(s -> System.out.println(s));

	}

}
