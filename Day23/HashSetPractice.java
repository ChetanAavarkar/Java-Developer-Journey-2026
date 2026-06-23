package Day23;

import java.util.HashSet;

public class HashSetPractice {
	public static void main(String[] args) {
		HashSet<String> Languages = new HashSet<String>();
		
		Languages.add("Java");
		Languages.add("Python");
		Languages.add("Java");
		Languages.add("C++");
		
		System.out.println(Languages);
	}

}
