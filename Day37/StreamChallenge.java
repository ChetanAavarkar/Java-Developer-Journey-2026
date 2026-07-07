package Day37;

import java.util.Arrays;
import java.util.List;

public class StreamChallenge {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Dev", "Ganesh");
		names.stream()
			 .filter(s -> s.length() > 4)
			 .map(String::toUpperCase)
			 .forEach(System.out::println);	
	}
}
