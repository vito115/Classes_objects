public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Dracula", 1897);
        System.out.println("book1.nameBook = " + book1.getNameBook());
        System.out.println("book1.publishingBook = " + book1.getPublishingBook());

        book1.setPublishingBook(1920);
        System.out.println("book1.getPublishingBook() = " + book1.getPublishingBook());

        Author author1 = new Author("Bram Stoker");
        System.out.println("author1.author = " + author1.getAuthor());

        Book book2 = new Book("Frankenstein", 1816);
        System.out.println("book2.nameBook = " + book2.getNameBook());
        System.out.println("book2.publishingBook = " + book2.getPublishingBook());

        book2.setPublishingBook(1818);
        System.out.println("book1.getPublishingBook() = " + book2.getPublishingBook());

        Author author2 = new Author("Mary Shelly");
        System.out.println("author2.author = " + author2.getAuthor());

    }
}