package exceptions;


class Hello{
	
	
	
	public Hello() throws Exception{
		if(String s=null){

			System.out.println(s.length());
			throw new Exception("It is nullpointer exception");
		}
		else {
			System.out.println("No error");
		}
		
	}
}

public class ThrowsDemo {

	public static void main(String[] args)throws Exception {
		
		Hello h=new Hello();

	}

}


