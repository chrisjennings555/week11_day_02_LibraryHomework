import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.bookCollection.size();
    }

    public void addBook(Book book){
        if(this.bookCount() < this.capacity)
        this.bookCollection.add(book);
    }
}
