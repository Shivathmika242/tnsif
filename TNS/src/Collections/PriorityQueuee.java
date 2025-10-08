package Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();

	      
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println("PriorityQueue elements: " + pq);


        System.out.println("Head of the queue: " + pq.peek());

 
        pq.poll();
        System.out.println("After removing head element: " + pq);

        
        System.out.println("Iterating through PriorityQueue:");
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
        System.out.println("Size of PriorityQueue: " + pq.size());

	}

}




