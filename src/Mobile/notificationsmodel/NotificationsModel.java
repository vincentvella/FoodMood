package Mobile.notificationsmodel;


public class NotificationsModel {
    
    int type;
    String message;
    
    /**
     * Default constructor for model
     */
    public NotificationsModel(){
        System.out.println("`-Notification Model Created");
        setNotificationType(0);
        setNotificationMessage(null);
        getNotificationType();
        getNotificationMessage();
    }
    
    /**
     * Sets the notification type
     * @param typeNum selected type 
     */
    public void setNotificationType(int typeNum){
        System.out.println("  `--Notification Type Set");
        type = typeNum;
    }
    
    /**
     * Sets the notification type
     * @param typeNum selected message 
     */
    public void setNotificationMessage(String noteMessage){
        System.out.println("  `--Notification Message Set");
        message = noteMessage;
    }
    
    /**
     * gets the notification type
     */
    public int getNotificationType(){
        System.out.println("  `--Getting Notification Type");
        int typeNum = type;
        return typeNum;
    }
    
    /**
     * gets the notification type
     */
    public String getNotificationMessage(){
        System.out.println("  `--Getting Notificaiton Message");
        String noteMessage = message;
        return noteMessage;
    }
}
