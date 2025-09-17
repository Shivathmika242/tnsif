package javatraining;

public class MultilevelInheritance {

	public static void main(String[] args) {
		 Base2 obj = new Base2 ();
		 obj.method1();
		 obj.method2();
		 obj.method3();
	}

}
 class Base{
	public void method1() {
		System.out.println("This is method1");
	}
}
 
 class Base1 extends Base{
	public void method2() {
		System.out.println("This is method2");
	}
}
 
 class Base2 extends Base1{
	public void method3() {
		System.out.println("This is method3");
	}
}