/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificationsview;
import notificationsctrl.NotificationsController;

public class Notifications {
    
    /**
     * This allows the user to view the current notification list
     */
    public Notifications(){
        System.out.println("New notif. window instantiated.");
    }
     
    /**
     * This allows the user to view details from a single notification
     */
    public void viewSingleNotification(){
        
    }
    
    /**
     * This allows the system to add a new notification to the view
     */
    public void createNotification(){
        
        //take interface input
        
        NotificationsController ctrl = new NotificationsController();
        ctrl.newNotification(2, "First notification");
    }
    
    /**
     * Allows the user to erase a notification from the view
     */
    public void deleteNotificationView(){
        
    }
    
}
