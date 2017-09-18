/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilemodel;

/**
 * This class holds all the relevant data someone will have on their profile
 * @author Joe
 */
public class Profile {
    private User user;
    private String emailAddress;
    /**
     * This is the default constructor for a profile
     */
    public Profile(){
        
    }
    
    /**
     * Sets the username
     * @param username 
     */
    public void setUser(User username){
    
        user = username;
        
    }
    
    /**
     * This gets a user's stored email address
     * @return The user's email
     */
    public String getEmail(String password){
        
        return emailAddress;
        
    }
    
    /**
     * This sets a user's email address to a new value
     * @param email The email to update with
     */
    public void setEmail(String email){
        
        emailAddress = null;
        
    }
}
