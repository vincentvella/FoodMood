/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificationsmodel;

/**
 *
 * @author Joe
 */
public class NotificationsModel {
    
    int type;
    String message;
    
    /**
     * Default constructor for model
     */
    public NotificationsModel(){

    }
    
    /**
     * Sets the notification type
     * @param typeNum selected type 
     */
    public void setNotificationType(int typeNum){
        
        type = typeNum;
    }
    
    /**
     * Sets the notification type
     * @param typeNum selected message 
     */
    public void setNotificationMessage(String noteMessage){
        
        message = noteMessage;
    }
    
    /**
     * gets the notification type
     */
    public int getNotificationType(){
        
        int typeNum = type;
        return typeNum;
    }
    
    /**
     * gets the notification type
     */
    public String getNotificationMessage(){
        
        String noteMessage = message;
        return noteMessage;
    }
}
