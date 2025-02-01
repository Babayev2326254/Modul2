package Vodevexsmplejava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private final List<LibraryItem> items;
    private static int totalItems = 0;

    public Library() {
        this.items = new ArrayList<>();
    }

    public Library addItem(LibraryItem item) {
        items.add(item);
        totalItems++;
        return this;
    }

    public void borrowItem(String title, String borrower) throws ItemNotAvailableException {
        Optional<LibraryItem> item = findItemByTitle(title);
        if (item.isPresent()) {
            LibraryItem libraryItem = item.get();
            if (libraryItem.getStatus() == ItemStatus.AVAILABLE) {
                libraryItem.setStatus(ItemStatus.BORROWED);
                System.out.println(borrower + " has borrowed: " + libraryItem.getTitle());
            } else {
                throw new ItemNotAvailableException("Item is not available for borrowing: " + title);
            }
        } else {
            throw new ItemNotAvailableException("Item not found: " + title);
        }
    }

    public void returnItem(String title) {
        Optional<LibraryItem> item = findItemByTitle(title);
        item.ifPresent(libraryItem -> {
            libraryItem.setStatus(ItemStatus.AVAILABLE);
            System.out.println("Returned: " + libraryItem.getTitle());
        });
    }

    public void printSortedItems(Comparator<LibraryItem> comparator) {
        items.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    public List<LibraryItem> searchItems(Predicate<LibraryItem> predicate) {
        return items.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public Optional<Book> findBookByTitle(String title) {
        return items.stream()
                .filter(item -> item instanceof Book && item.getTitle().equals(title))
                .map(item -> (Book) item)
                .findFirst();
    }

    private Optional<LibraryItem> findItemByTitle(String title) {
        return items.stream()
                .filter(item -> item.getTitle().equals(title))
                .findFirst();
    }

    // Binary search implementation (assuming items are sorted by title)
    public Optional<LibraryItem> binarySearchByTitle(String title) {
        List<LibraryItem> sortedItems = new ArrayList<>(items);
        sortedItems.sort(Comparator.comparing(LibraryItem::getTitle));

        int left = 0;
        int right = sortedItems.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = sortedItems.get(mid).getTitle().compareTo(title);

            if (comparison == 0) {
                return Optional.of(sortedItems.get(mid));
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return Optional.empty();
    }
}
