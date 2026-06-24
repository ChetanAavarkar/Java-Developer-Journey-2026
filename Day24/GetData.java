package Day24;

import java.util.HashMap;

public class GetData {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Chetan");
		hm.put(102, "Rahul");
		hm.put(103, "Aman");
		
		System.out.println("Orignal data: " + hm);
		
		System.out.println("Fetched data: " + hm.get(101));
	}

}
//khobryach khis, dhaniya, everest tikha laal
