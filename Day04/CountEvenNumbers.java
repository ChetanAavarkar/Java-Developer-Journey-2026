package basic.Day04;

public class CountEvenNumbers {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 8, 9, 10};
		int countEven = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				countEven++;
			}
		}
		System.out.println("Numbers of even elements: " + countEven);
	}
}
