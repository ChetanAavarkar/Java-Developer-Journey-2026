package Day25;

import java.util.HashMap;
import java.util.Map;

public class EntrySetPractice {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(101, "Chetan");
		hm.put(102, "Rahul");
		hm.put(103, "Aman");
		
		for (Map.Entry<Integer, String> entry : hm.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
