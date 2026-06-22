package Day22;

import java.util.LinkedList;

public class GetFruits {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		System.out.println("Original List: " + fruits);
		
		System.out.println("Required fruit: " + fruits.get(2));
	}
}
