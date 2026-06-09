package basic.Day09;

import java.util.Scanner;

public class FindSmallest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int smallest = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i];
			}
		}
		System.out.println(smallest + " is smallest element");
		sc.close();
	}
}
