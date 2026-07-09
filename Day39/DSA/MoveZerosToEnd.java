package Day39.DSA;

import java.util.Scanner;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int pos = 0;
        for (int i = 0; i < n; i++) {
        	if (arr[i] != 0) {
        		arr[pos] = arr[i];
        		pos++;
        	}
        }
        while (pos < n) {
        	arr[pos] = 0;
        	pos++;
        }
        System.out.println("Array after moving zeroes to end:");
        for (int value : arr) {
        	System.out.print(value + " ");
        }
        System.out.println();
        sc.close();
	}
}
