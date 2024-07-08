package grouptasks.classes;

import java.util.Arrays;

public class Library {
    // Fields
    private Book[] books;

    // Constructors
    public Library(Book[] books) {
        this.books = books;
    }

    // Getters and Setters
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
