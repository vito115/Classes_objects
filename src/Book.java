public class Book {

    private final String nameBook;
    private int publishingBook;

    public Book(String nameBook, int publishingBook) {

        this.nameBook = nameBook;
        this.publishingBook = publishingBook;
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
}
