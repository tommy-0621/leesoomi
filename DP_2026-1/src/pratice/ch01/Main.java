package pratice.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // 책 테스트
        Book book = new Book("자바의 정석");
        System.out.println("Book name: " + book.getName());

        // 책장 테스트
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("자바의 정석"));
        bookShelf.appendBook(new Book("자바의 정석2"));
        bookShelf.appendBook(new Book("자바의 정석3"));

        // 방법1: for문
        for (int i = 0; i < bookShelf.getLength(); i++) {
            System.out.println("Book" + (i + 1) + ": " + bookShelf.getBookAt(i).getName());
        }

        // 방법2: Iterator
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println("Book: " + it.next().getName());
        }

        // 방법3: 확장 for
        for (Book b : bookShelf) {
            System.out.println("Book: " + b.getName());
        }
    }
}