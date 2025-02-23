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

    // Methods
    public Book[] add(Book book) {
        int newLength = this.books.length;

        Book[] copiedArray = Arrays.copyOf(this.books, newLength + 1);
        copiedArray[copiedArray.length - 1] = book;
        this.books = copiedArray;
        return this.books;
    }
}
