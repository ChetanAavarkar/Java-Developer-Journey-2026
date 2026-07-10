package Day40;

import java.util.Optional;
import java.util.Scanner;

public class OptionalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name (or press Enter to leave empty): ");
		String str = sc.nextLine().trim();
		
		Optional<String> opstr = str.isEmpty()
				? Optional.empty()
				: Optional.of(str);
		System.out.println("\n Results");
		
		System.out.println("\n Using ifPresent");
		opstr.ifPresent(name -> System.out.println("Hello, " + name + "!"));
		
		System.out.println("\n Using orElse");
		String name = opstr.orElse("Guest");
		System.out.println("Welcome, " + name + "!");
		
		System.out.println("\n Using isPresent");
		if (opstr.isPresent()) {
			System.out.println("Name was provided: " + opstr.get());
		} else {
			System.out.println("No name was enterd.");
		}
		sc.close();
	}
}
