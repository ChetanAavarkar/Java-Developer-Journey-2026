package Day21;

import java.util.ArrayList;

public class Deletelist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Original List: " + list);
		
		list.clear();
		System.out.println("Deleted List: " + list);
	}
}

