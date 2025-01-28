package practices.lombok;

import lombok.*;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@With
@Getter
@Setter
public class Book {
    private final String id;
    private String title;
    private String author;
    private int pageCount;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}
