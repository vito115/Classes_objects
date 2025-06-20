import java.util.Objects;

public class Book {

    private final String nameBook;
    private int publishingBook;
    private final Author author;

    public Book(String nameBook, int publishingBook, Author author) {

        this.nameBook = nameBook;
        this.publishingBook = publishingBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getPublishingBook() {
        return publishingBook;
    }

    public void setPublishingBook(int publishingBook) {
        this.publishingBook = publishingBook;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Книга: " + nameBook + " , " + author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook);
    }
}
