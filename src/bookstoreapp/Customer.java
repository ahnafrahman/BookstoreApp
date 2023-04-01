package bookstoreapp;

public class Customer {
    private final String nameInput;
    private final String passInput;
    private double points;
    private String CustomerStatus;
    
    //Constructors
    Customer(String u, String p, double po){
        this.nameInput = u;
        this.passInput = p;
        this.points = po;
        setCustomerStatus(this.points);
    }
    
    //Getters
    public String getNameInput(){
        return this.nameInput;
    }

    
    public String getPassInput(){
        return this.passInput;
    }
    
    public double getPoints(){
        return this.points;
    }
    
    //Setters
    public void setPoints(double pointsToAdd){
        this.points += pointsToAdd;
        setCustomerStatus(this.points);
    }
    
    //Helper
    
    private void setCustomerStatus(double points){
        if (points > 1000) {
            this.CustomerStatus = "Gold";
        }
        else {
            this.CustomerStatus = "Silver";
        }
    }
}
