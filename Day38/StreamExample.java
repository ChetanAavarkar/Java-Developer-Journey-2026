package Day38;

import java.util.ArrayList;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(8);
		list.add(22);
		list.add(35);
		list.add(40);
		list.add(51);

		System.out.println("Even Numbers which is greater than 20:");
		list.stream()
		    .filter(n -> n % 2 == 0)
		    .filter(n -> n > 20)
		    .forEach(System.out::println);
		
		System.out.println("\nAll elements using method reference:");
		list.forEach(System.out::println);
		
		System.out.println("\nAll elements using lambda expression:");
		list.forEach(n -> System.out.println(n));
	}
}
