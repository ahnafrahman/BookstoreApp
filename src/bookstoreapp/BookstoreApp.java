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
import javafx.scene.layout.StackPane;
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
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("BookStoreApp");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Text loginTitle = new Text("Login");
        loginTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        Label userName = new Label("User Name: ");
        Label password = new Label("Password: ");
        
        TextField nameInput = new TextField();
        PasswordField passInput = new PasswordField();
        
        grid.add(loginTitle, 0,0,2,1);
        grid.add(userName,0,1);
        grid.add(nameInput,1,1);
        grid.add(password,0,2);
        grid.add(passInput,1,2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
