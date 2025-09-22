package javatraining;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		 // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() → add text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. charAt() → get character at specific index
        System.out.println("Character at index 4: " + sb.charAt(4));

        // 3. delete() → delete characters from startIndex (inclusive) to endIndex (exclusive)
        sb.delete(5, 11); // deletes " World"
        System.out.println("After delete: " + sb);

        // 4. length() → get current length
        System.out.println("Length: " + sb.length());

        // 5. reverse() → reverse the content
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. substring() → extract a part of the string
        sb.reverse(); // reversing back to original ("Hello")
        System.out.println("Substring(1,4): " + sb.substring(1,4));

	}

}
