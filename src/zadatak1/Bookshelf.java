package zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private List<Book> books;

    public Bookshelf () {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean containsBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(long ISBN) {
        for (Book book : books) {
            if (book.getISBN() == ISBN) {
                return true;
            }
        }
        return false;
    }

    public void printBookshelf() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
