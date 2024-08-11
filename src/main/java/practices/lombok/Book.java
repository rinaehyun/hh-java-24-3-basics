package practices.lombok;

import lombok.Builder;

@Builder
public class Book {
    private String title;
    private String author;
    private int pageCount;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
