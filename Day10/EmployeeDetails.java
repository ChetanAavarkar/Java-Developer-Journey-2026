package basic.Day10;

import java.util.Scanner;

class Employee {
	int id;
	String name;
	int salary;
	
	void display() {
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}
}
public class EmployeeDetails {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.println("Enter Employee Id: ");
		e.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee name: ");
		e.name = sc.nextLine();
		System.out.println("Enter Employee salary: ");
		e.salary = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Employee Details:");
		e.display();
		sc.close();
	}
}
