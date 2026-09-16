package lecture2;

import java.util.Objects;

public class Book {
    private final String author;
    private final int publicationYear;
    private final String title;
    private final MyBookType type;
                                                                
    public Book(String author, String title, int publicationYear,  MyBookType bookType){
        //Skip the error checking to save on time.
        this.author = Objects.requireNonNull(author);
        this.title = Objects.requireNonNull(title);
        this.publicationYear = publicationYear;
        
        this.type = bookType;
    }

}
