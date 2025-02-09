package FindTheBooks;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookApp {
    public static void main(String[] args) {
        Books book1 = new Books("The Catcher in the Rye", "J.D. Salinger", "Fiction", 10.99, 4.3);
        Books book2 = new Books("To Kill a Mockingbird", "Harper Lee", "Fiction", 8.99, 4.8);
        Books book3 = new Books("1984", "George Orwell", "Dystopian", 6.99, 4.7);
        Books book4 = new Books("The Great Gatsby", "F. Scott Fitzgerald", "Classics", 12.99, 4.4);
        Books book5 = new Books("Moby Dick", "Herman Melville", "Adventure", 15.50, 4.1);
        Books book6 = new Books("Pride and Prejudice", "Jane Austen", "Romance", 9.99, 4.6);
        Books book7 = new Books("War and Peace", "Leo Tolstoy", "Historical Fiction", 14.75, 4.5);
        Books book8 = new Books("The Hobbit", "J.R.R. Tolkien", "Fantasy", 11.00, 4.8);
        Books book9 = new Books("The Alchemist", "Paulo Coelho", "Philosophical", 7.99, 4.3);
        Books book10 = new Books("Brave New World", "Aldous Huxley", "Dystopian", 9.50, 4.2);

        List<Books> bookall = List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);

        List<Books> priceten = bookall.stream().filter(books -> books.getPrice() > 10).collect(Collectors.toList());
        priceten.forEach(System.out::print);

        System.out.println();

        List<Books> sorted = bookall.stream().sorted((book0, book11) -> Double.compare(book11.getPrice(), book0.getPrice())).collect(Collectors.toList());
        sorted.forEach(System.out::print);

        System.out.println();

        Optional<Books> mostExpensiveBook = bookall.stream().max((book0, book11) -> Double.compare(book0.getPrice(), book11.getPrice()));
        mostExpensiveBook.stream().forEach(System.out::print);

        System.out.println();

        Map<String, List<Books>> groupedByGenre = bookall.stream().collect(Collectors.groupingBy(Books::getGenre));
        groupedByGenre.forEach((genre, booksList) -> {
            System.out.println(genre + ": " + booksList);
        });

        System.out.println();


    }

}
