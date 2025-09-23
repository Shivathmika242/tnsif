package exceptions;

public class TestThrow {

	public static void main(String[] args) 
	{
		TestThrow1.calAge(2);
	}

}
class TestThrow1{
	public static void calAge(int age) {
		if(age<18) 
			throw new ArithmeticException("The age is less than 18");
		else
			System.out.println("Eligible for voting");
	}
}

