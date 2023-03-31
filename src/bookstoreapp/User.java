
package bookstoreapp;

public class User {
    private String username;
    private String password;
    private int points;
    private String status;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.points = 0;
        setStatus();
    }
    public String getUsername() {
        return this.username;
        
    } public String getPassword(){
        return this.password;
        
    } public int getPoints(){
        return this.points;
        
    } public void setStatus() {
       if (points > 1000) 
           status = "GOLD";
       else status = "SILVER";
           
           }  
}