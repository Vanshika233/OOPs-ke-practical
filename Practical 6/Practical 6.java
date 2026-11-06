class Book {
    String title;
    String author;
    int price;

    // Default constructor
    Book() {
        title = "Java";
        author = "ABC";
        price = 300;
    }

    // Parameterized constructor
    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}

public class Practical6 {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Python", "XYZ", 500);
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        b3.price = 600;

        System.out.println("After Changing Copy:");
        b3.display();

        System.out.println("Original Book:");
        b2.display();
    }
}
