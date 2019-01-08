import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        borrower = new Borrower();
        book1 = new Book("HP", "JKR", "Fantasy");
        book2 = new Book("Sapiens", "Harari", "History");
        book3 = new Book("Deus", "Yuval", "Future");
        library = new Library(2);
    }

    @Test
    public void hasEmptyBookCollection(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBooksToCollection(){
        library.addBook(book1);
        borrower.addBookToCollection(library);
        assertEquals(1, borrower.countBooks());
    }
    


}
