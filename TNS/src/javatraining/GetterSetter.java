package javatraining;

public class GetterSetter {

	public static void main(String[] args) {
         Student6 s=new Student6();
         s.setName("Shivathmika");
         s.setAge(20);
         
         System.out.println("Name:"+ s.getName());
         System.out.println("Age:"+ s.getAge());
	}

}

class Student6{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}




















































