package Iterator;

// Агрегат
public interface IterableCollection<T> {
    Iterator<T> createIterator();
}

