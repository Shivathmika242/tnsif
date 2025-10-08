package lambda;

public class ParaDemo {

	public static void main(String[] args) {
		 WithPara w = (a) -> {
				System.out.println("the value of a is: "+a);
				return a;
			};
			w.hello(5);

	}

}
