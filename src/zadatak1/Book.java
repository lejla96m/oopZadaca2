package zadatak1;

public class Book {

    private String title;
    private long ISBN;
    private String author;

    public Book (final String title, final long ISBN,  final String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public long getISBN() {
        return ISBN;
    }

    public String toString() {
        return title + ", " + author + " (" + ISBN + ")";
    }
}
