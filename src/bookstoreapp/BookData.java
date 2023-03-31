
package bookstoreapp;

public class BookData {
    protected String title;
    protected double price;

    public BookData(String title, double price) {
        this.price = price;
        this.title = title;
}
    public String getTitle(){
        return this.title;
        
    } public double getPrice() {
        return this.price;
    }
    
}