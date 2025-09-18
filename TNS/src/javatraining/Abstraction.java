package javatraining;

public class Abstraction {

	public static void main(String[] args) {
		 Square sq=new Square(5);
		 sq.calArea();
		 sq.show();
		 Rectangle1 re=new Rectangle1(4,6);
		 re.calArea();
		 re.show();

	}

}

abstract class Shape{
	double area;
	
	abstract void calArea();
	
	void show()
	{
		System.out.println("Area="+ area);
	}
	
}

class Rectangle1 extends Shape{
	double length,breadth;
	
	Rectangle1(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void calArea() {
		area=length * breadth;
	}
}

class Square extends Shape{
	double side;
	Square(double side){
		this .side=side;
	}
	void calArea() {
		area=side*side;
	}
	
}






















