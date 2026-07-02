package Day32;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Aman");
		names.add("Bhavesh");
		names.add("Chetan");
		names.add("Dev");
		names.add("Ethan");
		
		System.out.println("List of Names: ");
		for (String name : names) {
			System.out.println(name);
		}
	}
}
