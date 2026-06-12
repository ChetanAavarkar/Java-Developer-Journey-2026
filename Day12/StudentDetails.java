package basic.Day12;

import java.util.Scanner;

class Student {
	private String name;
	private int age;
	
	public Student() {
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("Age cannot be negative!");
		}
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Student s1 = new Student();
		
		System.out.println("Enter Student's name: ");
		String name = sc.nextLine();
		s1.setName(name);
		
		System.out.println("Enter Student's age: ");
		int age = sc.nextInt();
		s1.setAge(age);
		
		System.out.println("Name : " + s1.getName());
		System.out.println("Age  : " + s1.getAge());
		sc.close();
	}
}
