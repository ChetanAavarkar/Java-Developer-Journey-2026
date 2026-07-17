package Day47;

import java.util.ArrayList;

public class ArrayListRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Initial size of al: " + al.size());
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		System.out.println("Size of al after additions: " + al.size());
		
		System.out.println("Content of al: " + al);
	}
}