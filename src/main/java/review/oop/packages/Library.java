package review.oop.packages;

import java.util.Arrays;

public class Library {
    // Fields
    private Book[] books;

    // Constructors
    public Library() {}

    public Library(Book[] books) { this.books = books; }

    // Print
    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
