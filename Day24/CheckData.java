package Day24;

import java.util.HashMap;

public class CheckData {
	public static void main(String[] args) {
HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Chetan");
		hm.put(102, "Rahul");
		hm.put(103, "Aman");
		
		System.out.println("Does roll no 102 exist?: " + hm.containsKey(102));
	}
}
