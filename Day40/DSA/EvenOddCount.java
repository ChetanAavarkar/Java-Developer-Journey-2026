package Day40.DSA;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " integers");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int CountEven = 0;
		int CountOdd = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				CountEven++;
			}
			else {
				CountOdd++;
			}
		}
		
		System.out.println("Even = " + CountEven);
		System.out.println("Odd = " + CountOdd);
		sc.close();
	}
}
