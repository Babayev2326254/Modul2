package Vodevexsmplejava;

public interface Borrowable {
    void borrow(String borrower) throws ItemNotAvailableException;

    void returnItem();
}