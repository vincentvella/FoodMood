/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificationsctrl;
import notificationsmodel.NotificationsModel;
/**
 *
 * @author Joe
 */
public class NotificationsController{
    
    public NotificationsController(){
        System.out.println("New notif. ctrl instantiated.");
    }
    
    public void newNotification(int type, String message){
        //types
        //1 - warning , 2 - info
        
        NotificationsModel note1 = new NotificationsModel();
        note1.setNotificationType(type);
        note1.setNotificationMessage(message);
            
            System.out.println("Created test notification.");
            
        //add to arraylist/storage file to reference later
    }
}
