/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificationsview;
import notificationsctrl.*;

public class Notifications {
    
    /**
     * This allows the user to view the current notification list
     */
    public Notifications(){
        System.out.println("`-New notification window instantiated");
        viewSingleNotification();
        createNotification();
        deleteNotification();
        
    }
     
    /**
     * This allows the user to view details from a single notification
     */
    public void viewSingleNotification(){
        System.out.println("  `--Single Notification Viewed");
    }
    
    /**
     * This allows the system to add a new notification to the view
     */
    public void createNotification(){
        //take interface input
        System.out.println("  `--Creating new Notification");
    }
    
    /**
     * Allows the user to erase a notification from the view
     */
    public void deleteNotification(){
        System.out.println("  `--Deleting Notification");
    }
}
