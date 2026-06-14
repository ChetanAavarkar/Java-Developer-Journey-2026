package basic.Day14;

class Vehicle {
	void display() {
		System.out.println("Hyundai");
	}
}

class Car extends Vehicle {
	void display() {
		System.out.println("Creta");
	}
}

public class VehicleDetails {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Car();
		v1.display();
		v2.display();
	}
}
