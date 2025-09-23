package polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		Dog d = new Dog();
		d.sound();
	}

	}


class Animal{
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog barks");
	}
}
