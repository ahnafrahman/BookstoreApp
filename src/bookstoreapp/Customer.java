package bookstoreapp;

public class Customer {
    private final String nameInput;
    private final String passInput;
    private int points;
    private String CustomerStatus;
    
    //Constructors
    Customer(String u, String p, int po){
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
    
    public int getPoints(){
        return this.points;
    }
    
    //Setters
    public void setPoints(int points){
        this.points = points;
        setCustomerStatus(this.points);
    }
    public void addPoints(int pointsToAdd){
        this.points += pointsToAdd;
        setCustomerStatus(this.points);
    }
    public String getStatus(){
        return this.CustomerStatus;
    }
    
    //Helper
    
    private void setCustomerStatus(int points){
        if (points >= 1000) {
            this.CustomerStatus = "Gold";
        }
        else {
            this.CustomerStatus = "Silver";
        }
    }
}
