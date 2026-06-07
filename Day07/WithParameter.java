package basic.Day07;

public class WithParameter {
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		int total = add(10, 20);
		System.out.println("Total is: " + total);
	}

}
