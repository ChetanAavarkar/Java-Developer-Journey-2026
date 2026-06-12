package basic.Day12;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.setSalary(salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Salary must be positive. Value not updated.");
		}
	}
	
	public void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: $" + salary);
	}
}
public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Enter Employee's id: ");
		int id = sc.nextInt();
		emp.setId(id);
		sc.nextLine();
		
		System.out.println("Enter Employee's name: ");
		String name = sc.nextLine();
		emp.setName(name);
		
		
		System.out.println("Enter Employee's salary: ");
		double salary = sc.nextDouble();
		emp.setSalary(salary);
		
		System.out.println("Employee id: " + emp.getId());
		System.out.println("Employee name: " + emp.getName());
		System.out.println("Employee salary: " + emp.getSalary());
		sc.close();
	}
}
