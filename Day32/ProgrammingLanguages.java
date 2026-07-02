package Day32;

import java.util.ArrayList;

public class ProgrammingLanguages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("C++");
		languages.add("Go");
		
		System.out.println(" Top Programming Languages \n");
		
		for (String lang : languages) {
			System.out.println(". " + lang);
		}
		System.out.println("\nTotal Languages: " + languages.size());
        System.out.println("Contains Java? " + languages.contains("Java"));
	}
}
