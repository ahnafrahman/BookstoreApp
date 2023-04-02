package bookstoreapp;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

  public void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new username: ");
        String username = scanner.nextLine();

        System.out.print("Enter new password: ");
        String password = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("Customer.txt");
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + password + "\n");
            writer.close();
            System.out.println("Customer credentials written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }

}