package Day42;

import java.util.Optional;
import java.util.Scanner;

public class OptionalRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		Optional<String> opstr = Optional.ofNullable(null);
		System.out.println("Is value present? " + opstr.isPresent());
		
		String result = opstr.orElse("Ram");
		System.out.println("Value: " + result);
		
		opstr.ifPresent(value -> System.out.println("value inside: " + value));
		sc.close();
	}
}
