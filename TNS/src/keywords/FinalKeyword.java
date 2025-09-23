package keywords;

public class FinalKeyword {

	public static void main(String[] args) {
		Vehicle V = new Vehicle();
	     V.show();

	}

}

final class Vehicle{
	// final variable (constant value)
	final int speedLimit = 80;

    // final method (cannot be overridden)
	final void show() {
     System.out.println("Speed Limit is: " + speedLimit + " km/h");
	}
}
