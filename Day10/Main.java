package basic.Day10;

import java.util.Scanner;

class Student {
	String name;
	int age;
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("Enter your name: ");
		s.name = sc.nextLine();
		System.out.println("Enter your age: ");
		s.age = sc.nextInt();
		
		System.out.println("Your Data: ");
		s.display();
		sc.close();
	}
}
