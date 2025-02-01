package FunctionalprogramintestApp;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        try {
            library.addBook(new Book("1234", "Java Programming", "John Doe"));
            library.addBook(new Book("5678", "Python Basics", "Jane Smith"));
            library.addBook(new Book("9101", "C++ Advanced", "Bob Johnson"));
        } catch (InvalidISBNException e) {
            System.err.println("Error adding book: " + e.getMessage());
        }

        // Find a book
        try {
            Optional<Book> book = library.findBook("1234");
            book.ifPresent(System.out::println);
        } catch (BookNotFoundException e) {
            System.err.println("Book not found: " + e.getMessage());
        }

        // Sort books
        library.sortBooks();
        System.out.println("Sorted by ISBN:");
        library.getBooks().forEach(System.out::println);

        // Sort books by title
        library.sortBooks(Comparator.comparing(Book::getTitle));
        System.out.println("Sorted by Title:");
        library.getBooks().forEach(System.out::println);

        // Find books by author
        List<Book> johnDoeBooks = library.findBooks(book -> book.getAuthor().equals("John Doe"));
        System.out.println("Books by John Doe:");
        johnDoeBooks.forEach(System.out::println);
    }
}
