package bookstoreapp;

public class Customer {
    private final String username;
    private final String password;
    private int points;
    private CustomerStatus status;
    
    //Constructors
    Customer(String username, String password){
        this.username = username;
        this.password = password;
        this.points = 0;
        setCustomerStatus(this.points);
    }
    
    //Getters
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public CustomerStatus getCustomerStatus(){
    return this.status;
    }
    
    //Setters
    public void setPoints(int pointsToAdd){
        this.points += pointsToAdd;
        setCustomerStatus(this.points);
    }
    
    //Helper
    private void setCustomerStatus(int points){
        if (points > 1000) {
            this.status = new GoldStatus();
        }
        else {
            this.status = new SilverStatus();
        }
    }
}

