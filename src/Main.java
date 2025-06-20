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
        System.out.println("book2.getPublishingBook() = " + book2.getPublishingBook());

        // Проверка toString()
        System.out.println(book1);
        System.out.println(book2);

        // Проверка equals
        System.out.println("Имена авторов равны: " + author1.equals(author2));
        boolean areEqual = author1.getFirstName().equals(book1.getAuthor().getFirstName());
        System.out.println("Имена авторов равны: " + areEqual);
        boolean areEqual2 = author1.getFirstName().equals(book2.getAuthor().getFirstName());
        System.out.println("Имена авторов равны: " + areEqual2);

        System.out.println("Названия книг равны: " + book1.equals(book2));
        Book book3 = new Book("Dracula", 1897, author1);
        System.out.println("Названия книг равны: " + book1.equals(book3));

        // Проверка hashCode
        System.out.println(author1.hashCode() == book1.getAuthor().hashCode());
        System.out.println(author1.hashCode() == book2.getAuthor().hashCode());

        System.out.println(book1.hashCode() == book2.hashCode());
        System.out.println(book1.hashCode() == book3.hashCode());
    }
}