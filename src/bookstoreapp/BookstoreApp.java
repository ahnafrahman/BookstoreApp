/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoreapp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
/**
 *
 * @author ahnaf
 */
public class BookstoreApp extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        VBox grid = new VBox();
        VBox l2 = new VBox();
        VBox owner = new VBox();
        
        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10);
//        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        l2.setAlignment(Pos.CENTER);
        l2.setPadding(new Insets(25, 25, 25, 25));
        owner.setAlignment(Pos.CENTER);
        owner.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 300, 250);
        Scene customerScene = new Scene(l2,300,250);
        Scene ownerScene = new Scene(owner,300,250);
        
        Text loginTitle = new Text("Welcome to JavaReads!");
        loginTitle.setFont(Font.font("Cambria", FontWeight.NORMAL,24));
        Label userName = new Label("Username: ");
        Label password = new Label("Password: ");
         
        TextField nameInput = new TextField();
        PasswordField passInput = new PasswordField();
        
        grid.getChildren().add(loginTitle);
        grid.getChildren().add(userName);
        grid.getChildren().add(nameInput);
        grid.getChildren().add(password);
        grid.getChildren().add(passInput);
        
        
        Button signIn = new Button("Sign in");
        HBox hbSignIn = new HBox(10);
        hbSignIn.setAlignment(Pos.BOTTOM_RIGHT);
        hbSignIn.getChildren().add(signIn);
        grid.getChildren().add(hbSignIn);
        signIn.setOnAction(e -> primaryStage.setScene(customerScene));
        
        Button button2 = new Button("Backwards");
        button2.setOnAction(e -> primaryStage.setScene(scene));
        
        Text nullInfo = new Text();
        grid.getChildren().add(nullInfo);
        
        
         
        
        
        Label customer = new Label("customer");
        l2.getChildren().addAll(customer,button2);
        
        Button bookButton = new Button("Books");
        Button cusButton = new Button("Customers");
        Button logoutButton = new Button("Logout");
        
        owner.getChildren().addAll(bookButton,cusButton,logoutButton);
        
        signIn.setOnAction(new EventHandler<ActionEvent>() {
            
            
        @Override
        public void handle(ActionEvent e) {
            if(nameInput.getText().equals("") || passInput.getText().equals("")){
                nullInfo.setFill(Color.FIREBRICK);
                nullInfo.setText("Please enter your information.");
            }
             
            else if(nameInput.getText().equals("admin") && passInput.getText().equals("admin")){
                System.out.println("OWNER");
                primaryStage.setScene(ownerScene);
            }
            else{
                System.out.println("CUSTOMER");
                primaryStage.setScene(customerScene);
            }
        }
        });   
        
        
        
        cusButton.setOnAction(new EventHandler<ActionEvent>() {
           
        @Override
        public void handle(ActionEvent e) {
            primaryStage.setScene(customerList(scene, primaryStage));
        }
        });   
        
        
        
        
        primaryStage.setTitle("BookStoreApp");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Scene customerList(Scene scene,Stage primaryStage){
        VBox cusList = new VBox();
        TableView table = new TableView();
        TableColumn<Customer, String> column1= new TableColumn<>("Name");
        table.getColumns().add(column1);
        
        TableColumn<Customer, String> column2= new TableColumn<>("Password");
        table.getColumns().add(column2);
        
        TableColumn<Customer, String> column3= new TableColumn<>("Points");
        table.getColumns().add(column3);
        
        Button add = new Button("Add");
        Button delete = new Button("Delete");
        Button back = new Button("Back");
        
        Scene customerList = new Scene(cusList,300,250);
        Label userName = new Label("Username: ");
        Label password = new Label("Password: ");
        
        TextField nameInput = new TextField();
        PasswordField passInput = new PasswordField();
        
        cusList.getChildren().addAll(table,userName,nameInput,password,passInput,add,delete,back);
        
        back.setOnAction(new EventHandler<ActionEvent>() {           
            
        @Override
        public void handle(ActionEvent e) {
            primaryStage.setScene(scene);
        }
        });   
        
        add.setOnAction(new EventHandler<ActionEvent>() {           
            
        @Override
        public void handle(ActionEvent e) {
            Owner owner = new Owner();
            owner.addNewCustomer();
        }
        });   
        
        return customerList;
    }
    
     public static void SaveCustomers(String thing){         //This function adds the books created to the Books.txt file
        
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("Customers.txt", true);          //Open the file
            
            byte[] s_array = thing.getBytes();                      //Turn the string into bytes
            fos.write(s_array);                                     //Write the bytes

        } catch (FileNotFoundException ex) {                        //Throws file not found exception
            System.out.println("Customers not found");
        } catch (IOException ex) {
            System.out.println("IOException on SaveBooks");         //Throws IO exception
        }
        finally{
            try {
                fos.close();                                        //Close the file
            } catch (IOException ex) {                              //Throws couldn't close file exception
                System.out.println("Customers not closed");

            }
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
