package practices.lombok;

public class Main {
    public static void main(String[] args) {
        Book b1 = Book.builder().build();
        Book b2 = Book.builder()
                .title("ABCD")
                .author("Thomas. H")
                .pageCount(500)
                .build();

        System.out.println(b1);
        System.out.println(b2);
    }
}
