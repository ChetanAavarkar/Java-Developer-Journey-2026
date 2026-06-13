package basic.Day13;

import java.util.Scanner;

class Person {
	String name;
}

class Student extends Person {
	String rollNo;
}
public class StudentDetails {
	public static void main(String[] args) {
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's name: ");
		s1.name = sc.nextLine();
		
		System.out.println("Enter Student's rollNo: ");
		s1.rollNo = sc.nextLine();
		
		System.out.println("Student Name: " + s1.name);
		System.out.println("Student rollNo: " + s1.rollNo);
		
		sc.close();
	}
}

