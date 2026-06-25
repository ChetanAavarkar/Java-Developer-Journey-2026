package Day25;

import java.util.HashMap;

public class AllData {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(101, "Chetan");
		hm.put(102, "Rahul");
		hm.put(103, "Aman");
		
		for (String value : hm.values()) {
			System.out.println("value: " + value);
		}
	}
}
