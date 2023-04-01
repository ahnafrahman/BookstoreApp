package bookstoreapp;

public abstract class Customer {
    private final String nameInput;
    private final String passInput;
    private int points;
//    private String CustomerStatus;
    
    //Constructors
    Customer(String username, String password){
        this.nameInput = username;
        this.passInput = password;
        this.points = 0;
//        setCustomerStatus(this.points);
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
//    public void setPoints(int pointsToAdd){
//        this.points += pointsToAdd;
//        setCustomerStatus(this.points);
//    }
    
    //Helper
    
//    private void setCustomerStatus(int points){
//        if (points > 1000) {
//            this.CustomerStatus = "Gold";
//        }
//        else {
//            this.CustomerStatus = "Silver";
//        }
//    }
}

