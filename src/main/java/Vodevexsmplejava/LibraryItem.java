package Vodevexsmplejava;

import java.util.Objects;

public abstract class LibraryItem implements Comparable<LibraryItem> {
    private final String title;
    private final String author;
    private final int yearPublished;
    private ItemStatus status;

    public LibraryItem(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.status = ItemStatus.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public ItemStatus getStatus() {
        return status;
    }


    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    @Override
    public int compareTo(LibraryItem other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryItem)) return false;
        LibraryItem that = (LibraryItem) o;
        return yearPublished == that.yearPublished &&
                Objects.equals(title, that.title) &&
                Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished);
    }
}
