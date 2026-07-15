package Day45.DSA;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> freqMap = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}
		
		char result = '_';
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (freqMap.get(ch) == 1) {
				result = ch;
				break;
			}
		}
		if (result == '_') {
			System.out.println("No non-repeating character found.");
		} else {
			System.out.println("First non-repeating character: " + result);
		}
		sc.close();
	}
}