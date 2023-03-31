
package bookstoreapp;
import javafx.scene.control.*;

public class Book {
    
        private String title;
        private double price;
        public CheckBox select;
            
            public Book(String title, double price){
                this.title = title;
                this.price = price;
                this.select = new CheckBox();
            }
            
            public String getTitle() {
                return this.title;
            }
            
            public double getPrice() {
                return this.price;
            }
            public CheckBox getSelect() {
                return select;
            }
            public void setSelect(CheckBox selected) {
                this.select = selected;
            }
}
