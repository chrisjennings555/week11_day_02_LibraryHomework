import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookCollection;

    public Borrower(){
        this.bookCollection = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.bookCollection.size();
    }

    public void addBookToCollection(Library library){
        Book borrowedBook = library.removeBook();
        this.bookCollection.add(borrowedBook);
    }


}
