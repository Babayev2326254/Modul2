package Vodevexsmplejava;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        // Adding magazines
        Magazine magazine1 = new Magazine("National Geographic", "Various", 2023, 6);
        Magazine magazine2 = new Magazine("Time", "Various", 2023, 5);

        library.addItem(magazine1);
        library.addItem(magazine2);

        // Demonstrating searching and sorting
        System.out.println("All items sorted by title:");
        library.printSortedItems(Comparator.comparing(LibraryItem::getTitle));

        System.out.println("\nBooks published before 1950:");
        List<LibraryItem> oldBooks = library.searchItems(item -> item instanceof Book && ((Book) item).getYearPublished() < 1950);
        oldBooks.forEach(System.out::println);

        // Demonstrating exception handling
        try {
            library.borrowItem("1984", "John Doe");
            library.borrowItem("1984", "Jane Smith"); // This should throw an exception
        } catch (ItemNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Demonstrating date and time API
        LocalDate dueDate = LocalDate.now().plusDays(14);
        System.out.println("\nDue date for borrowed items: " + dueDate);

        // Demonstrating generics and optional
        Optional<Book> foundBook = library.findBookByTitle("1984");
        foundBook.ifPresent(book -> System.out.println("Found book: " + book));

        // Demonstrating method chaining
        library.addItem(new Book("Brave New World", "Aldous Huxley", 1932))
                .addItem(new Magazine("Wired", "Various", 2023, 7))
                .printSortedItems(Comparator.comparing(LibraryItem::getTitle));
    }
}