package basicprograms;

public class Operators {
	 public static void main(String[] args) {
	        int a = 10, b = 5;

	        // Arithmetic Operators
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));

	        // Relational Operators
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a != b: " + (a != b));

	        // Logical Operators
	        boolean x = true, y = false;
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));

	        // Unary Operators
	        int num = 5;
	        System.out.println("num++: " + (num++)); // Post-increment
	        System.out.println("++num: " + (++num)); // Pre-increment
	        System.out.println("num--: " + (num--)); // Post-decrement
	        System.out.println("--num: " + (--num)); // Pre-decrement

	        // Assignment Operators
	        int c = 10;
	        c += 5; // c = c + 5
	        System.out.println("c += 5 → " + c);

	        // Ternary Operator
	        int max = (a > b) ? a : b;
	        System.out.println("Max of a and b: " + max);
	    }
}
