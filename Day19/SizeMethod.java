package Day19;

import java.util.ArrayList;

public class SizeMethod {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.size();
		
		System.out.println(list);
		System.out.println("Size of list: " + list.size());
	}

}
