/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilectrl;

import userprofilemodel.Profile;

public class UserInfo {
    
    /**
     * This is the default constructor for the setUserInfo class
     */
    public UserInfo(){
        System.out.println("New userinfo instantiated.");
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