package keywords;

public class StaticKeyword {

	public static void main(String[] args) {
		StaticProperities.show();
	
	}

}

class StaticProperities{
	
    // static variable
    static int number;

    // static block
    static {
        number = 10;
        System.out.println("Static block executed.");
    }

    // static method
    static void show() {
        System.out.println("Number is: " + number);
    }
}


