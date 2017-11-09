package notificationsctrl;
import notificationsmodel.NotificationsModel;
import notificationsview.Notifications;

public class NotificationsController{
    
    public NotificationsController(){
        System.out.println("`-New notification control instantiated");
        NotificationsModel note = new NotificationsModel();
        Notifications view = new Notifications();
        newNotification(0, null);
    }
    
    public void newNotification(int type, String message){
        //types
        //1 - warning , 2 - info
        System.out.println("`-Created new notification");
            
        //add to arraylist/storage file to reference later
    }
}
