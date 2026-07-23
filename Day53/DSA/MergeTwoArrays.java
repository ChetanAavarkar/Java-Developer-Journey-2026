package Day53.DSA;

import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array elements: ");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		
		System.out.print("Enter " + n1 + " integers");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter array elements: ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		
		System.out.print("Enter " + n2 + " integers");
		for (int i = 0; i< n2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int[] merged = new int[n1 + n2];
		
		int index = 0;
		for (int num : arr1) {
			merged[index++] = num;
		}
		for (int num : arr2) {
			merged[index++] = num;
		}
		
		System.out.println("Merged array:");
		for (int num : merged) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}