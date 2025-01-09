package review.oop.packages;

public class Main {
    public static void main(String[] args) {
        // Create objects of Library
        Library library1 = new Library();
        System.out.println(library1);

        Book book1 = new Book("Harry Potter", "J.K. Rowling", "3429-3328");
        Book book2 = new Book("1984", "George Orwell", "3235-9872");
        Book[] books = {book1, book2};
        Library library2 = new Library(books);
        System.out.println(library2);
    }
}
