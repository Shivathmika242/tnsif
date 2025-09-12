package javatraining;

class Car{
	String color="Black";
	String model="Thar";
	String company ="Mahindra";
	
	public void moving() {
		System.out.println(model + " is moving");
	}
	
	public void stopping() {
		System.out.println(model + " is stopping");
	}
	
	public void drifting() {
		System.out.println(model+" is drifting");
	}
}


public class CarTest {

	public static void main(String[] args) {
		   Car myCar = new Car();
		   System.out.println("Car Details");
		   
		   System.out.println( " Color : " + myCar.color);
		   System.out.println( " model : " + myCar.model);
		   System.out.println( " company: " + myCar.company);
		   
		   
		   myCar.moving();
		   myCar.stopping();
		   myCar.drifting();

	}

}
