package pratice.ch02;

import java.util.Iterator; //jdk에서 제공하는 Iterator 인터페이스를 사용하기 위해 import
import java.util.NoSuchElementException;

    public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;  //책꽂이가 가지고있는 거 (마름모모양) index

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() { //책꽂이에서 다음책이 있는지 확인하는 메소드
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() { //책꽂이에서 다음책을 꺼내오는 메소드
        if (!hasNext()) { 
            throw new NoSuchElementException(); //더이상 꺼낼 책이 없을 때 예외처리
        }
        Book book = bookShelf.getBookAt(index); //책꽂이에서 현재 위치의 책을 가져옴
        index++;
        return book;
    }
}
