package Day40;

import java.util.Optional;
import java.util.Scanner;

public class OptionalNull {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		Optional<String> opstr = Optional.ofNullable(null);
		System.out.println("Is value present? " + opstr.isPresent());
		
		String result = opstr.orElse("Ram");
		System.out.println("Value: " + result);
		
		opstr.ifPresent(value -> System.out.println("Value inside: " + value));
		sc.close();
	}
}
