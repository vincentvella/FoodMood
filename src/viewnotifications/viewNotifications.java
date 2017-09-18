/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewnotifications;

/**
 *
 * @author zzt5046
 */
public class viewNotifications {
    
    /**
     * This is the default constructor for the viewNotifications class that will create the interface/list
     */
    public viewNotifications(){
    
    }
     
    /**
     * This returns the type of a created Notification
     * @param typeNum Type number that corresponds to a type name (String)
     * @return The (string) type of Notification created
     */
    public String getType(int typeNum){
        String typeName = "";
        
        if(typeNum == 1){
            
        }
        else if(typeNum == 2){
            
        }
        
        return typeName;
    }
    
    /**
     * This returns a generic message based on the type of Notification
     * @param typeNum Type number that corresponds to a type w/ message
     * @return The (string) message of the certain type of notification
     */
    public String getMessage(int typeNum){
        String message = "";
        
        if(typeNum == 1){
            
        }
        else if(typeNum == 2){
            
        }
        
        return message;
    }
}
