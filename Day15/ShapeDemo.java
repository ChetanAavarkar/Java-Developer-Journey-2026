package basic.Day15;

import java.util.Scanner;

abstract class Shape {
	String name;
	
	Shape(String name) {
		this.name = name;
	}
	
	abstract double area();
	
	public void displayArea() {
		System.out.printf("The area of %s is: %.2f\n", name, area());
	}
	
	public void info() {
		System.out.println("Shape Type: " + name);
	}
}

class Circle extends Shape {
	double radius;
	
	Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	double length;
	double width;
	
	Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}
	double area() {
		return length * width;
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a shape: ");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("Enter your choice (1 to 2): ");
		int choice = sc.nextInt();

		Shape sh = null;
		
		if (choice == 1) {
			System.out.print("Enter radius of Circle: ");
			double radius = sc.nextDouble();
			sh = new Circle("Circle", radius);
		} else if (choice == 2) {
			System.out.println("Enter length of Rectangle: ");
			double length = sc.nextDouble();
			System.out.println("Enter width of Recatngle: ");
			double width = sc.nextDouble();
			sh = new Rectangle("Rectangle", length, width);
		} else {
			System.out.println("Invalid choice! Defaulting to Circle.");
			System.out.print("Enter radius of Circle: ");
			double radius = sc.nextDouble();
			sh = new Circle("Circle", radius);
		}
		System.out.println("\n---Result---");
		sh.info();
		sh.displayArea();
		sc.close();
	}
}
