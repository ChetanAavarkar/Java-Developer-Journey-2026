package Day34;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		numbers.stream()
				.filter(n -> n > 25)
				.forEach(System.out::println);
	}
}
