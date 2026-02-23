
class Book {
    String title;
    String author;

    // Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor with only title
    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Book1{
    public static void main(String[] args) {
        // Instantiate both types of objects
        Book b1 = new Book("The Hobbit", "Tolkien");
        Book b2 = new Book("A Book");

        // Display details
        b1.display();
        b2.display();
    }
}