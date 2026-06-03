package basic;

import java.util.Scanner;

public class menudrivencalculator {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Press 1 for Addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for Multiplication");
			System.out.println("Press 4 for Division");
			System.out.println("Press 5 for Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			if (choice == 5) {
				System.out.println("Thank you for using calculator");
				break;
			}
			
			System.out.println("Enter a number: ");
			int a = sc.nextInt();
			System.out.println("Enter a number: ");
			int b = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				System.out.println("Addition is: " + (a + b));
				break;
				
			case 2:
				System.out.println("Subtraction is: " + (a - b));
				break;
				
			case 3:
				System.out.println("Multiplication is: " + (a * b));
				break;
				
			case 4:
				if (b == 0) {
					System.out.println("Error: division by zero is not allowed");
				} else {
					System.out.println("Division is: " + (a / b));
				}
				break;
				
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
		sc.close();
	}
}
