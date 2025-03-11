public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "A Song of Ice and Fire";
        this.author = "George R. R. Martin";
        this.price = 599.99;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display method
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayBookInfo();

        System.out.println();

        // Using parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 399.99);
        book2.displayBookInfo();
    }
}
