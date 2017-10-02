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
        System.out.println("UserProfileCtrl instantiated");
    }
    
    public void setEmail(User user1, String email){
        
        Profile test = null;
        test.setEmail(email);
    }
    
    public void setNotifications(User user1, int num){
        
        Profile test = null;
        test.setReceiveNotifications(num);
    }
}
