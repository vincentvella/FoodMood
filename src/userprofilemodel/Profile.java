/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilemodel;

public class Profile {
    private User user;
    private String emailAddress;
    private int notifications;
    /**
     * This is the default constructor for a profile
     */
    public Profile(){
        System.out.println("`-New profile instantiated.");
        setUser(null);
        getUser(null);
        setEmail(null);
        getEmail(null);
        setReceiveNotifications(0);
        getReceiveNotifications(1);
    }
    
    /**
     * Sets the username
     * @param username 
     */
    public void setUser(User username){
        System.out.println("  `--Set Username");
        user = username;
        
    }
    
    public User getUser(User username){
        System.out.println("  `--Get Username");
       return this.user;   
    }
    
    /**
     * This gets a user's stored email address
     * @return The user's email
     */
    public String getEmail(String password){
        System.out.println("  `--Get Email");
        return emailAddress;
        
    }
    
    /**
     * This sets a user's email address to a new value
     * @param email The email to update with
     */
    public void setEmail(String email){
        System.out.println("  `--Set Email");
        emailAddress = null;
        
    }
    
    public void setReceiveNotifications(int x){
        System.out.println("  `--Set Receive Notificaions");
        notifications = x;
    }
    
    public int getReceiveNotifications(int x){
        System.out.println("  `--Get Receive Notificaions");
        return notifications;
    }
}
