package FunctionalprogramintestApp;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public <T extends Book> void addBook(T book) {
        if (book.getIsbn() == null || book.getIsbn().isEmpty()) {
            throw new InvalidISBNException("ISBN cannot be null or empty");
        }
        books.add(book);
    }

    public Optional<Book> findBook(String isbn) throws BookNotFoundException {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst();
    }

    public List<Book> findBooks(Predicate<Book> predicate) {
        return books.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public void sortBooks() {
        Collections.sort(books);
    }

    public void sortBooks(Comparator<Book> comparator) {
        books.sort(comparator);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
