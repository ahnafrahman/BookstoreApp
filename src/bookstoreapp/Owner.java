package bookstoreapp;
import java.io.IOException;
import java.util.ArrayList;

public class Owner{
   
    private static final Files files = new Files();
    protected static ArrayList<Book> bookList = new ArrayList<>(); 
    private static final ArrayList<Customer> customerList = new ArrayList<>();

    public void restockArrays() throws IOException {
      
        ArrayList<Book> tempBookList = files.readBookFile();
        ArrayList<Customer> tempCustomerList = files.readCustomerFile();
        bookList.addAll(tempBookList);
        customerList.addAll(tempCustomerList);
    }

    public String getUsername(){
        return "admin";
    }
    public String getPassword(){
        return "admin";
    }

    public void addCustomer(Customer c){
        customerList.add(c);
    }

    public void deleteCustomer(Customer c){
        customerList.remove(c);
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Customer> getCustomers(){
        return (ArrayList<Customer>) customerList.clone();
    }

  

}