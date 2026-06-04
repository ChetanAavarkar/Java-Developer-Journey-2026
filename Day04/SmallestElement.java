package basic.Day04;

public class SmallestElement {
	public static void main(String[] args) {
		int[] numbers = {10, 50, 30, 20};
		int smallest = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest element: " + smallest);
	}
}
