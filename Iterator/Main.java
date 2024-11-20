package Iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Война и Мир"));
        bookCollection.addBook(new Book("Евгений Онегин"));
        bookCollection.addBook(new Book("Банда Четырёх"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book: " + book.getTitle());
        }
    }
}

