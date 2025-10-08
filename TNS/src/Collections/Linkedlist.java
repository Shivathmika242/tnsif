package Collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> fruit=new LinkedList<>();
		fruit.add("Apple");
		fruit.add("orange");
		fruit.add("grapes");
		fruit.add("banana");
		System.out.println("Initial LinkedList: " + fruit);
		
		fruit.addFirst("dragonfruit");
		fruit.addLast("custard");
		System.out.println("After adding first and last: " + fruit);
		
		 System.out.println("First Element: " + fruit.getFirst());
	     System.out.println("Last Element: " + fruit.getLast());
	     
	     fruit.remove("Banana");
	     fruit.removeFirst();
	     fruit.removeLast();
	     System.out.println("After removing elements: " + fruit);
	     
	     
	     System.out.println("Size of LinkedList: " + fruit.size());

	}

}



