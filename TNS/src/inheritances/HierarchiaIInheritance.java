package inheritances;

//Parent class
class Book {
 String title;
 String author;
 double price;

 void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: ₹" + price);
 }
}

//Child class 1
class Novel extends Book {
 String genre;

 void showNovelDetails() {
     displayDetails();
     System.out.println("Genre: " + genre);
     System.out.println("---------------------");
 }
}

//Child class 2
class Textbook extends Book {
 String subject;

 void showTextbookDetails() {
     displayDetails();
     System.out.println("Subject: " + subject);
     System.out.println("---------------------");
 }
}

//Child class 3
class Magazine extends Book {
 String publicationMonth;

 void showMagazineDetails() {
     displayDetails();
     System.out.println("Publication Month: " + publicationMonth);
     System.out.println("---------------------");
 }
}

//Main class
public class HierarchiaIInheritance {
 public static void main(String[] args) {
     // Novel Object
     Novel n1 = new Novel();
     n1.title = "The Alchemist";
     n1.author = "Paulo Coelho";
     n1.price = 299.99;
     n1.genre = "Fiction";
     n1.showNovelDetails();

     // Textbook Object
     Textbook t1 = new Textbook();
     t1.title = "Data Structures";
     t1.author = "Mark Weiss";
     t1.price = 599.99;
     t1.subject = "Computer Science";
     t1.showTextbookDetails();

     // Magazine Object
     Magazine m1 = new Magazine();
     m1.title = "National Geographic";
     m1.author = "Various";
     m1.price = 199.99;
     m1.publicationMonth = "September 2025";
     m1.showMagazineDetails();
 }
}