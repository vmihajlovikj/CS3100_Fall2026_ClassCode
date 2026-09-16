package BookAndAuthor;

import java.util.Objects;

import com.google.common.collect.EnumBiMap;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;
    private final BookType bookType;

    public Book(String author, String title, int publicationYear, BookType bookType){
        //Check for exceptions here

        this.author = Objects.requireNonNull(author);
        this.title = Objects.requireNonNull(title);
        this.publicationYear = publicationYear;
        this.bookType = bookType;
    }

    @Override 
    public String toString(){
        return this.author + " " + this.title + " " + this.publicationYear + " " + bookType;
    }
}
