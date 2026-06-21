package Day20;

import java.util.ArrayList;

public class removefriuits {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		System.out.println("Original List: " + fruits);

		fruits.remove(1);
		
		System.out.println("Updated List: " + fruits);
	}
}
	

