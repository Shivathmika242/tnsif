package javatraining;

public class InterfaceToInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p = new Puppy();
	     p.eat();   // method from Animal interface
	     p.bark();  // method from Dog interface
	}
}

//Parent interface
interface Animal {
 void eat();
}

//Child interface extending parent interface
interface Dog extends Animal {
 void bark();
}

//Implementing class
class Puppy implements Dog {
 public void eat() {
     System.out.println("Puppy is eating...");
 }
 
 public void bark() {
     System.out.println("Puppy is barking...");
 }
}


