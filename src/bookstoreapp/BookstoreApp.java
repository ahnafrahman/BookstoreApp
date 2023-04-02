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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ahnaf
 */
public class BookstoreApp extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        VBox grid = new VBox();
        VBox l2 = new VBox();
        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(10);
//        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        l2.setAlignment(Pos.CENTER);
        l2.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 300, 250);
        Scene customerScene = new Scene(l2,300,250);
        
        
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
        
        signIn.setOnAction(new EventHandler<ActionEvent>() {
            
            
        @Override
        public void handle(ActionEvent e) {
            if(nameInput.getText().equals("") || passInput.getText().equals("")){
                nullInfo.setFill(Color.FIREBRICK);
                nullInfo.setText("Please enter your information.");
            }
             
            else if(nameInput.getText().equals("admin") && passInput.getText().equals("admin"))
                System.out.println("OWNER");
            else{
                System.out.println("CUSTOMER");
                primaryStage.setScene(customerScene);
            }
        }
        });   
        
        primaryStage.setTitle("BookStoreApp");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
//    public Scene customerScreen(){
//        VBox l2 = new VBox();
//        l2.setAlignment(Pos.CENTER);
//        
//        Text customer = new Text("customer");
//        
//        Scene customerScene = new Scene(l2,600,800);
//        System.out.println("works");
//        return customerScene; 
//    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
