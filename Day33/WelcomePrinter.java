package Day33;

public class WelcomePrinter {
	public static void main(String[] args) {
		Greeter greetLambda = name -> System.out.println("Welcome " + name);
		
		greetLambda.greet("Chetan");
	}
}
