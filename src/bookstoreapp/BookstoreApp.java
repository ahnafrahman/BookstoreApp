/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoreapp;

import javafx.application.Application;
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
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
            
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("BookStoreApp");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Text loginTitle = new Text("Welcome to JavaReads");
        loginTitle.setFont(Font.font("Cambria", FontWeight.NORMAL,24));
        Label userName = new Label("User Name: ");
        Label password = new Label("Password: ");
        
        TextField nameInput = new TextField();
        PasswordField passInput = new PasswordField();
        
        grid.add(loginTitle, 0,0,2,1);
        grid.add(userName,0,1);
        grid.add(nameInput,1,1);
        grid.add(password,0,2);
        grid.add(passInput,1,2);
        
        
        Button signIn = new Button("Sign in");
        HBox hbSignIn = new HBox(10);
        hbSignIn.setAlignment(Pos.BOTTOM_RIGHT);
        hbSignIn.getChildren().add(signIn);
        grid.add(hbSignIn, 1, 4);
        
        Text nullInfo = new Text();
        grid.add(nullInfo,1,6);
        
        signIn.setOnAction(new EventHandler<ActionEvent>() {
 
        @Override
        public void handle(ActionEvent e) {
            if(nameInput.getText().equals(null) || passInput.getText().equals(null)){
                nullInfo.setText("Please enter information");
            }
                
            else if(nameInput.getText().equals("admin") && passInput.getText().equals("admin"))
                System.out.println("OWNER");
            else
                System.out.println("CUSTOMER");
        }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
