
package bookstoreapp;
import java.util.ArrayList;

public class BookstoreManager {
    private ArrayList<BookData> bookList;
    private static BookstoreManager instance;
    
    public BookstoreManager (){
        
    } 
    public static BookstoreManager getInstance(){
        if (instance == null){
            instance = new BookstoreManager();
        } return instance;
    }
    public void addBooks(BookData book){
     bookList.add(book);   
     
    }public void removeBooks(int index){
     bookList.remove(index);
     
    }public ArrayList<BookData> getBookList() {
        return bookList;
}
}