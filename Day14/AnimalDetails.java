package basic.Day14;

class Animal {
	void sound() {
		System.out.println("Shout");	
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Barking");
	}
}
 
public class AnimalDetails {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		a1.sound();
		a2.sound();
	}
}
