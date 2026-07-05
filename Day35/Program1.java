package Day35;

import java.util.ArrayList;

public class Program1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		languages.add("JavaScript");
		
		languages.forEach(l -> System.out.println(l));
	}
}
