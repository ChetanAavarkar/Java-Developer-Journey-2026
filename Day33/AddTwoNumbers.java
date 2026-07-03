package Day33;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder sum = (a, b) -> a + b;
		
		int x = 7, y = 5;
		int result = sum.add(x, y);
		
		System.out.println("Sum = " + result);
	}
}
