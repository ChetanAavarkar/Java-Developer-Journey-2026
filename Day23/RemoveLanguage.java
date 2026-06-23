package Day23;

import java.util.HashSet;

public class RemoveLanguage {
	public static void main(String[] args) {
		HashSet<String> Languages = new HashSet<String>();
		
		Languages.add("Java");
		Languages.add("Python");
		Languages.add("Java");
		Languages.add("C++");
		
		System.out.println("Original List: " + Languages);
		
		Languages.remove("C++");
		System.out.println("Updated List: " + Languages);
	}

}
