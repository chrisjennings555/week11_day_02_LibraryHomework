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

    public Book removeBook(){
        return this.bookCollection.remove(0);
    }

//    public void borrowBook(Borrower borrower){
////        Book borrowedBook = this.removeBook();
////    }
}
