package exceptions;


class Hello{
	
	String s=null;
	int len=s.length();
	public Hello() throws Exception{
		System.out.println(len);
		throw new Exception("It is nullpointer exception");
	}
}

public class ThrowsDemo {

	public static void main(String[] args)throws Exception {
		
		Hello h=new Hello();

	}

}


