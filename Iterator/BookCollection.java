package Iterator;

import java.util.ArrayList;
import java.util.List;

// Конкретный агрегат
public class BookCollection implements IterableCollection<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator();
    }

    // Конкретный итератор
    private class BookIterator implements Iterator<Book> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            if (hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }
}

