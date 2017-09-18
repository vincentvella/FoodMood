/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilemodel;

/**
 *
 * @author jjo5151, zzt5046
 */
public class User {
    
    private String username;
    private String password;
    private String emailAddress;
    
    /**
     * This is the default constructor for the User class
     */
    public User(){
        
    }
    
    /**
     * This authenticates a user's log in information
     * @param user The username to authenticate
     * @param pass The password to authenticate
     * @return The boolean result from authenticate, true is authenticated
     */
    public boolean authenticate(String user, String pass){
        boolean auth = false;
        
        if(user.equals(username) && pass.equals(password)){
            auth = true;
        }
        
        return auth;
    }
    
    /**
     * This gets a user's stored email address
     * @param username The username to authenticate
     * @param password The password to authenticate
     * @return If authenticated, will return email string.
     */
    public String getEmail(String username, String password){
        String out = "Error: not authenticated.";
        
        if(authenticate(username, password)){
           out = emailAddress; 
        }
        
        return out;
    }
    
    /**
     * This sets a user's email address to a new value if authenticated
     * @param username The username to authenticate
     * @param password The password to authenticate
     * @param email The email to update with
     */
    public void setEmail(String username, String password, String email){
        
        if(authenticate(username, password)){
            emailAddress = email;
        }
        else{
            System.out.print("Error: not authenticated.");
        }
        
    }
}
