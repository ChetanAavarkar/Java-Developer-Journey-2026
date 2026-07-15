package Day45.DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		HashMap<Character, Integer> freqMap = new HashMap<>();
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			
			if (freqMap.containsKey(ch)) {
				freqMap.put(ch, freqMap.get(ch) + 1);
			} else {
				freqMap.put(ch, 1);
			}
		}
		
		System.out.println("Character frequencies:");
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		sc.close();
	}
}
