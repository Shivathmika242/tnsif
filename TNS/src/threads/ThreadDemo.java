package threads;

public class ThreadDemo {

	public static void main(String[] args) {
		threadExtends te=new threadExtends();
		te.start();

	}

}

 class threadExtends extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println("This is catch block");
			}
		}
	}
}