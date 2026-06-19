package Day19;

import java.util.ArrayList;

public class removemethod {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.remove(1);
		//write index number to remove an element
		
		System.out.println(list);
	}
}
