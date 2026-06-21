package Day21;

import java.util.ArrayList;

public class Updatelist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Original List: " + list);
		
		list.set(1, 200);
		System.out.println("Updated List: " + list);
	}
}
