import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower borrower1;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("HP", "JKR", "Fantasy");
        book2 = new Book("Sapiens", "Harari", "History");
        book3 = new Book("Deus", "Yuval", "Future");

    }

    @Test
    public void hasNoBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBooks(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
        library.removeBook();
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
        library.addBook(book3);
        assertEquals(2, library.bookCount());
    }

//    @Test
//    public void personCanBorrowBook(){
//        library.addBook(book1);
//        Book borrowedBook = library.removeBook();
//        borrower1.
//    }

}
