package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfGenreIterator implements Iterator<Book> {
    private Book[] filteredBooks;
    private int index;

    public BookShelfGenreIterator(BookShelf bookShelf, String genre) {
        int length = bookShelf.getLength();

       
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (bookShelf.getBookAt(i).getGenre().equals(genre)) {
                count++;
            }
        }

        
        filteredBooks = new Book[count];
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (bookShelf.getBookAt(i).getGenre().equals(genre)) {
                filteredBooks[k] = bookShelf.getBookAt(i);
                k++;
            }
        }

        
        for (int i = 0; i < filteredBooks.length - 1; i++) {
            for (int j = 0; j < filteredBooks.length - 1 - i; j++) {
                if (filteredBooks[j].getYear() < filteredBooks[j + 1].getYear()) {
                    Book temp = filteredBooks[j];
                    filteredBooks[j] = filteredBooks[j + 1];
                    filteredBooks[j + 1] = temp;
                }
            }
        }

        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < filteredBooks.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return filteredBooks[index++];
    }
}