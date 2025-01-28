package practices.lombok;

public class Main {
    public static void main(String[] args) {

        Book a1 = new Book("1");
        System.out.println(a1);

        Book a2 = new Book("2", "harry potter", "xxx", 350);
        System.out.println(a2);

        // @Builder
        Book b1 = Book.builder()
                .id("3")
                .title("Vegetarian")
                .author("Han Kang")
                .build();
        System.out.println(b1);

        // @With -> returns a copy of the object
        Book b2 = b1
                .withId("13")
                .withPageCount(300);

        // @Setter -> modify the original object (only non-final properties can be modified)
        b1.setAuthor("HANKANG");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b2.getAuthor());
    }
}
