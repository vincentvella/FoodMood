/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilectrl;
import userprofilemodel.Profile;
import userprofilemodel.User;


/**
 *
 * @author Zach
 */
public class UserProfileCtrl {
    
    public UserProfileCtrl(){
        
        Profile profile1 = new Profile();
        User user1 = new User();
        System.out.println("`-User Profile Control Instantiated");
        setEmail(null, null);
        setNotifications(null, 0);
    }
    
    public void setEmail(User user1, String email){
        System.out.println("`--Set User Email");
        Profile test = null;
    }
    
    public void setNotifications(User user1, int num){
        
        Profile test = null;
    }
}
