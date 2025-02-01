package Vodevexsmplejava;

public class Magazine extends LibraryItem {
    private final int issueNumber;

    public Magazine(String title, String author, int yearPublished, int issueNumber) {
        super(title, author, yearPublished);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", issueNumber=" + issueNumber;
    }
}
