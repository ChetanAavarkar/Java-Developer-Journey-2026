package Day35.DSA;

import java.util.Scanner;

public class PositiveNegative {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numbers (space separated): ");
		String input = sc.nextLine();
		
		String[] numbers = input.trim().split("\\s+");
		
		int positive = 0;
		int negative = 0;
		
		for (String numStr : numbers) {
			if (!numStr.isEmpty()) {
				int num = Integer.parseInt(numStr);
				if (num > 0) {
					positive++;
				} else if (num < 0) {
					negative++;
				}
			}
		}
		System.out.println("Positive = " + positive);
		System.out.println("Negative = " + negative);
		
		sc.close();
	}
}
