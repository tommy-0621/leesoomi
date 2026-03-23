package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfYearIterator implements Iterator<Book> {
    private Book[] sortBooks;
    private int index;

    public BookShelfYearIterator(BookShelf bookShelf) {
        int length = bookShelf.getLength();
        sortBooks = new Book[length];

        for (int i = 0; i < length; i++) {
            sortBooks[i] = bookShelf.getBookAt(i);
        }

        // 최신 연도부터 나오도록 내림차순 정렬
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (sortBooks[j].getYear() < sortBooks[j + 1].getYear()) {
                    Book temp = sortBooks[j];
                    sortBooks[j] = sortBooks[j + 1];
                    sortBooks[j + 1] = temp;
                }
            }
        }

        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortBooks.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortBooks[index++];
    }
}