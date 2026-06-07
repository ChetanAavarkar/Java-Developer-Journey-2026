package basic.Day07;

public class Largest {
	public static int biggest(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		int a = 45;
		int b = 78;
		
		int largest = biggest(a, b);
		
		System.out.println("The largest number between " + a + " and " + b + " is: " + largest);
	}

}
