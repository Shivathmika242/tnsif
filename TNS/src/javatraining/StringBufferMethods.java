package javatraining;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Create a StringBuffer object
		        StringBuffer sb = new StringBuffer("Hello");

		        // 1. append() → adds text at the end
		        sb.append(" World");
		        System.out.println("After append: " + sb);

		        // 2. charAt() → get character at specific index
		        System.out.println("Character at index 4: " + sb.charAt(4));

		        // 3. delete() 
		        sb.delete(5, 11); // deletes " World"
		        System.out.println("After delete: " + sb);

		        // 4. length() → returns total characters
		        System.out.println("Length: " + sb.length());

		        // 5. reverse() → reverses the content
		        sb.reverse();
		        System.out.println("After reverse: " + sb);

		        // 6. substring() → extract a part of the string
		        sb.reverse(); // reversing back to "Hello"
		        System.out.println("Substring(1,4): " + sb.substring(1,4));
		  
	}

}
