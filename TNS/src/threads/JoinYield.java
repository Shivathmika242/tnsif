package threads;


//Simple program to show join() and yield() methods

class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 3; i++) {
         System.out.println(getName() + " running, step " + i);

         // At step 2, let other threads have a chance to run
         if (i == 2) {
             Thread.yield();   // suggest CPU to switch to another thread
         }
     }
 }
}

public class JoinYield {
 public static void main(String[] args) {
     MyThread t1 = new MyThread();
     MyThread t2 = new MyThread();

     t1.start();
     t2.start();

     try {
         // main thread waits until t1 finishes
         t1.join();
     } catch (InterruptedException e) {
         System.out.println(e);
     }

     System.out.println("Main thread continues after t1 has finished.");
 }
}