package basic.Day16;

interface Shape {
	double area();
}

class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}

class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		return length * width;
	}
}

public class CalculateArea {
	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		Shape rectangle = new Rectangle(4.0, 6.0);
		
		System.out.println("Area of Circle: " + circle.area());
		System.out.println("Area of Rectangle: " + rectangle.area());
	}
}
