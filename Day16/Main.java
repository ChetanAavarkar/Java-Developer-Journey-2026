package basic.Day16;

interface Animal {
	void sound();
}

class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("Dog : Bark");
	}
}

class Cat implements Animal {
	@Override
	public void sound() {
		System.out.println("Cat : Meow");
	}
}

class Cow implements Animal {
	@Override
	public void sound() {
		System.out.println("Cow : Moo");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal cow = new Cow();
		
		dog.sound();
		cat.sound();
		cow.sound();
	}
}
