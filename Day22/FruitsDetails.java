package Day22;

import java.util.LinkedList;

public class FruitsDetails {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		for(String f : fruits) {
			System.out.println("Original fruits: " + f);
		}
	}
}
