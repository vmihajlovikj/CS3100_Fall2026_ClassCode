package lecture2;

import java.util.Objects;

public class Book {
    private final String author;
    private final int publicationYear;
    private final String title;
    private final BookType type;

    public Book(String author, String title, int publicationYear, BookType type){
        //Skip the error checking to save on time.
        this.author = Objects.requireNonNull(author);
        this.title = Objects.requireNonNull(title);
        this.publicationYear = publicationYear;
        this.type = type;
    }

}
