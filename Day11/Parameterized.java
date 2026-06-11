package basic.Day11;

import java.util.Scanner;

class Student {
	String name;
	int age;
	
	Student(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
public class Parameterized {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String n = sc.nextLine();
		System.out.println("Enter your age: ");
		int a = sc.nextInt();
		
		Student s1 = new Student(n, a);
		s1.display();
		sc.close();
	}

}
