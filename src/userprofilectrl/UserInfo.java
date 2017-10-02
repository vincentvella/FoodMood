/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilectrl;

import userprofilemodel.Profile;
import userprofilemodel.User;
import userprofileview.ProfileView;

public class UserInfo {
    
    /**
     * This is the default constructor for the setUserInfo class
     */
    public UserInfo(){
        System.out.println("New userinfo instantiated.");
        User bob = new User();
        
        Profile username = null;
        setEmail(username, "emailaddress");
        
        ProfileView view = new ProfileView();
    }
    
    /**
     * This sets a user's email address to a new value if authenticated
     * @param username The user who's setting are affected
     * @param email Email value to replace with
     */
    public void setEmail(Profile username, String email){
            
        username.setEmail(email);
    }
}