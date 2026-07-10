package Day40;

import java.util.Optional;
import java.util.Scanner;

public class OptionalPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		Optional<String> opstr = Optional.of(str);
		System.out.println("Optional created: " + opstr);
		opstr.ifPresent(value -> System.out.println("Value inside Optional: " + value));
		sc.close();
	}
}
