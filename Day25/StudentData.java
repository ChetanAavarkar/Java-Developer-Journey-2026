package Day25;

import java.util.HashMap;

public class StudentData {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(101, "Chetan");
		hm.put(102, "Rahul");
		hm.put(103, "Aman");
		
		for (Integer key : hm.keySet()) {
			System.out.println("key: " + key);
		}
	}
}
