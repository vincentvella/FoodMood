/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilemodel;

public class User {
    
    private String username;
    private String password;

    
    /**
     * This is the default constructor for the User class
     */
    public User(){
        System.out.println("New user instantiated.");
    }
    
    void setUsername(String username){
        this.username = username;
    }
    
    String getUsername(){
        return username;
    }
    
    void setPassword(String password){
        this.password = password;
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
    
}
