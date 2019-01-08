import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;
    Book book2;

    @Before
    public void before(){
       book1 = new Book("HP", "JKR", "Fantasy");
       book2 = new Book("Sapiens", "Harari", "History");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("HP", book1.getTitle());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("History", book2.getGenre());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("JKR", book1.getAuthor());
    }
}
