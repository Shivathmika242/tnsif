package javatraining;

public class SingleInheritance {

	public static void main(String[] args) {
		 Teacher tr = new Teacher();
		 Student stu= new Student();
		 tr.display();
		 stu.display1();
		 stu.display();
	}

}

 class Teacher{
	public void display() {
		System.out.println("Teacher is teaching");
	}
}
 
 class Student extends Teacher {
	 public void display1() {
		 System.out.println("Student is listening");
	 }
 }