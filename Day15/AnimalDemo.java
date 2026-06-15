package basic.Day15;

import java.util.Scanner;

abstract class Animal {
	String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	abstract void sound();
	
	public void eat() {
		System.out.println(name + " is eating food.");
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping peacefully.");
	}
	
	public void info() {
		System.out.println("Animal: " + name);
	}
}

class Dog extends Animal {
	Dog(String name) {
		super(name);
	}
	
	void sound() {
		System.out.println(name + " says: Woof! Woof!");
	}
	
	public void wagTail() {
		System.out.println(name + " is wagging its tail happily!");
	}
}

class Cat extends Animal {
	Cat(String name) {
		super(name);
	}
	
	void sound() {
		System.out.println(name + " says: Meow! Meow!");
	}
	
	public void purr() {
		System.out.println(name + " is purring softly.");
	}
}
public class AnimalDemo {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter animal name: ");
		String name = sc.nextLine();
		
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("Enter your choice (1 to 2): ");
		int choice = sc.nextInt();
		Animal an = null;
		
		if (choice == 1) {
			an = new Dog(name);
		} else if (choice == 2) {
			an = new Cat(name);
		} else {
			System.out.println("Invalid choice! Defaulting to Dog.");
			an = new Dog(name);
		}
		
		an.info();
		an.sound();
		an.eat();
		an.sleep();
		
		if (an instanceof Dog) {
			((Dog) an).wagTail();
		} else if (an instanceof Cat) {
			((Cat) an).purr();
		}
		sc.close();
	}
}
