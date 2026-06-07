package basic.Day07;

public class EvenOdd {
	public static void find(int a) {
		if(a % 2 == 0) {
			System.out.println(a + " is Even");
		} else {
			System.out.println(a + " is Odd");
		}
	}
	
	public static void main(String[] args) {
		find(10);
		find(7);
	}
}
