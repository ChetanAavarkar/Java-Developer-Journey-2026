package Day22;

import java.util.LinkedList;

public class RemovedLinkedList {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		
		System.out.println("Original List: " + fruits);
		
		fruits.remove(1);
		System.out.println("Updated List: " + fruits);
	}
}
