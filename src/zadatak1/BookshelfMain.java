package zadatak1;

public class BookshelfMain {
    public static void main (String[] args) {

        Bookshelf bookshelf = new Bookshelf();

        Book book1 = new Book("Proces", 995871714L, "Kafka Franz");
        Book book2 = new Book("Mladi mjesec", 9789958300318L, "Meyer Stephanie");
        Book book3 = new Book("Tvrđava", 9958820048L, "Selimović Meša");

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        bookshelf.printBookshelf();

        System.out.println("Availability: " + bookshelf.containsBook("1984"));
        System.out.println("Availability: " + bookshelf.containsBook("Proces"));
        System.out.println("Availability: " + bookshelf.containsBook(9780451524935L));

    }
}
