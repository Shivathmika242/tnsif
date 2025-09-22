package javatraining;

class Animalll {
    String color = "Brown";

    Animalll() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Doggg extends Animalll {
    String color = "Black";

    Doggg() {
        super();
        System.out.println("Dog constructor called");
    }

    void displayColor() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);
    }

    void eat() {
        System.out.println("Dog is eating");
        super.eat();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Doggg d = new Doggg();
        d.displayColor();
        d.eat();
    }
}
