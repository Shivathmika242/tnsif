package Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		TreeSet<String> fruits = new TreeSet<String>();

	      
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); 

        System.out.println("TreeSet elements (sorted): " + fruits);

        
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        
        System.out.println("Does TreeSet contain Mango? " + fruits.contains("Mango"));

       
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

       
        System.out.println("First element: " + fruits.first());
        System.out.println("Last element: " + fruits.last());

       
        System.out.println("Size of TreeSet: " + fruits.size());
    }

	}


