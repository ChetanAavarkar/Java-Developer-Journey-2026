package basic.Day13;

import java.util.Scanner;

class Vehicle {
	String brand;
}

class Car extends Vehicle {
	String model;
}

public class VehicleDetails {
	public static void main(String[] args) {
		Car cr = new Car();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your car brand name: ");
		cr.brand = sc.nextLine();
		
		System.out.println("Enter your car model name: ");
		cr.model = sc.nextLine();
		
		System.out.println("Car brand: " + cr.brand);
		System.out.println("Car model: " + cr.model);
		
		sc.close();
	}
}
