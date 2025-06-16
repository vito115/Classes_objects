public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Bram", "Stoker");
        Book book1 = new Book("Dracula", 1897, author1);
        System.out.println("book1.nameBook = " + book1.getNameBook());
        System.out.println("book1.publishingBook = " + book1.getPublishingBook());
        System.out.println("author1 = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());

        book1.setPublishingBook(1920);
        System.out.println("book1.getPublishingBook() = " + book1.getPublishingBook());

        Author author2 = new Author("Mary", "Shelley");
        Book book2 = new Book("Frankenstein", 1816, author2);
        System.out.println("book2.nameBook = " + book2.getNameBook());
        System.out.println("book2.publishingBook = " + book2.getPublishingBook());
        System.out.println("author2 = " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());

        book2.setPublishingBook(1818);
        System.out.println("book1.getPublishingBook() = " + book2.getPublishingBook());

    }
}