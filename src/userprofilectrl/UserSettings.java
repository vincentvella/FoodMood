/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilectrl;

import userprofilemodel.Profile;

public class UserSettings {
    
    /**
     * This is the default constructor for setUserSettings
     */
    public UserSettings(){
        System.out.println("New usersettings ctrl instantiated.");
        Profile username = null;
        setNotifications(username, 1);
    }
    
    /**
     * This sets a user's email address to a new value if authenticated
     * @param username The user who's setting are affected
     * @param x Integer representing yes(1) or no(0)
     */
    public void setNotifications(Profile username, int x){
        
        username.setReceiveNotifications(x);
    }
}
