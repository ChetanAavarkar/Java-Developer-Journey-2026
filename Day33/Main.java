package Day33;

public class Main {
	public static void main(String[] args) {
		MyOperation add = (a, b) -> a + b;
		MyOperation multiply = (a, b) -> a * b;
		
		int x = 5, y = 3;
		System.out.println("Addition: " + add.calculate(x, y));
		System.out.println("Multiplication: " + multiply.calculate(x, y));
	}
}
