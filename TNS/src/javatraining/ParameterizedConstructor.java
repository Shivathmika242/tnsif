package javatraining;

public class ParameterizedConstructor {

	public static void main(String[] args) {
		    Rectangle r1 = new Rectangle(10, 5);
	        Rectangle r2 = new Rectangle(7, 3);

	        System.out.println("Area of Rectangle 1: " + r1.area());
	        System.out.println("Area of Rectangle 2: " + r2.area());

	}

}

class Rectangle {
    int length, breadth;

    
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    
    int area() {
        return length * breadth;
    }
}