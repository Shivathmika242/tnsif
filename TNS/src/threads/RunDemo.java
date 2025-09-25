package threads;

public class RunDemo {

	public static void main(String[] args) {
		RunnableInf rn=new RunnableInf();
		Thread t1 =new Thread(rn);
		t1.start();

	}

}

class RunnableInf implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i);
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("This is catch block");
			}
		}
	}
}