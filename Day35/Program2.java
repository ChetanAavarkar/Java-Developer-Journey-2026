package Day35;

import java.util.ArrayList;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("JavaScript");
		
		languages.stream()
				 .filter(l -> l.length() > 4)
				 .forEach(System.out::println);
	}
}
