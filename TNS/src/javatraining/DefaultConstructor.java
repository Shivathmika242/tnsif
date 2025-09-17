package javatraining;

public class DefaultConstructor {

	public static void main(String[] args) {
		 Book2 b2 = new Book2();
		 b2.display();

	}

}
class Book2 {
    String title;
    String author;

    Book2() {
        title = "Unknown";
        author = "Not Assigned";
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
