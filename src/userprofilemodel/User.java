/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilemodel;

/**
 *
 * @author jjo5151
 */
public class User {
    
    private String username;
    private String password;
    
    /**
     * This is the default constructor for the User class
     */
    public User(){
        
    }
    
    /**
     * This authenticates a user's log in information
     * @param username The username to authenticate
     * @param password The password to authenticate
     * @return The boolean result from authenticate, true is authenticated
     */
    public boolean authenticate(String username, String password){
        return true;
    }
}
