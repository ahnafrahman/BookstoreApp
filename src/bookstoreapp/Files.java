//package bookstoreapp;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Files {
//
//    public void bookFileWrite(ArrayList<Book> books) throws IOException{
//      
//        FileWriter bFile = new FileWriter("book.txt", true);
//        for(Book b: books){//for-each loop
//            String bookInfo = b.getTitle() + ", " + b.getPrice() + "\n";
//            bFile.write(bookInfo);
//        }
//        bFile.close();
//    }//this copies the arrayList of books into a file
//
//    public void customerFileWrite(ArrayList<Customer> customers) throws IOException{
//      
//        FileWriter cFile = new FileWriter("customer.txt", true);
//        for(Customer c: customers){//for-each loop
//            String outputText = c.getUsername() + ", " + c.getPassword() + ", " + c.getPoints() + "\n";
//            cFile.write(outputText);
//        }
//        cFile.close();
//    }//same as above but for customer arrayList
//
//    public void bookFileReset() throws IOException {
//      
//        FileWriter bFile = new FileWriter("book.txt", false);
//        bFile.close();
//    }//this resets the entire file so we can copy the new book stock in the arraylist
//
//    public void customerFileReset() throws IOException {
//      
//        FileWriter customerFile = new FileWriter("customer.txt", false);
//        customerFile.close();
//    }
//
//    public ArrayList<Book> readBookFile() throws IOException{
//       
//        Scanner scan = new Scanner(new FileReader("book.txt"));
//        ArrayList<Book> tempBookHolder = new ArrayList<>();
//
//        while(scan.hasNext()) {
//            String[] bookInfo = scan.nextLine().split(",");
//            String title = bookInfo[0];
//            double price = Double.parseDouble(bookInfo[1]);
//            tempBookHolder.add(new Book(title, price));
//        }
//        return tempBookHolder;
//    }// reads book file and returns an ArrayList of books
//
//    public ArrayList<Customer> readCustomerFile() throws IOException{
//        
//        Scanner scan = new Scanner(new FileReader("customer.txt"));
//        ArrayList<Customer> tempCustomerHolder = new ArrayList<>();
//
//        while(scan.hasNext()) {
//            String[] customerInfo = scan.nextLine().split(", ");
//            String username = customerInfo[0];
//            String password = customerInfo[1];
//            int points = Integer.parseInt(customerInfo[2]);
//            tempCustomerHolder.add(new Customer(username, password));
//            tempCustomerHolder.get(tempCustomerHolder.size()-1).setPoints(points);
//        }
//        return tempCustomerHolder;
//    }//reads customer file and returns an ArrayList of customers
//
//}