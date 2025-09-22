package javatraining;

public class StringMethods {

	public static void main(String[] args) {
		
		String str1 = " Hello World ";
        String str2 = "hello world";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. compareTo()
        // 0 if equal, positive if str1 > str2, negative if str1 < str2 (lexicographically)
        System.out.println("compareTo result: " + str1.trim().compareTo(str2));

        // 4. contains()
        System.out.println("Contains 'World': " + str1.contains("World"));

        // 5. concat()
        System.out.println("Concatenation: " + str1.concat("!!!"));

        // 6. equals()
        System.out.println("Equals str2: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.trim().equalsIgnoreCase(str2));

        // 7. toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 8. toLowerCase()
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 9. replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // 10. split()
        String[] words = str1.trim().split(" "); // split by space
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 11. trim()
        System.out.println("Trimmed String: '" + str1.trim() + "'");

	}

}

