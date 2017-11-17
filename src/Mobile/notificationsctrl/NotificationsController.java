package Mobile.notificationsctrl;
import Mobile.notificationsmodel.NotificationsModel;
import Mobile.notificationsview.Notifications;
import Mobile.mainmenuview.MainMenu;
import Mobile.userprofilemodel.Profile;
import java.util.Timer;
import java.util.TimerTask;

public class NotificationsController{
    
    private Profile prof;
    MainMenu main = new MainMenu(prof);
    
    public NotificationsController(){
        System.out.println("`-New notification control instantiated");
        NotificationsModel note = new NotificationsModel();
        Notifications view = new Notifications();
        newNotification(0, null);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            //Turns notification on after 2 minutes
            
            @Override
            public void run() {
               main.notificationEnable();
            }
        }, 5000);
    }
    
    
    public void newNotification(int type, String message){
        //types
        //1 - warning , 2 - info
        System.out.println("`-Created new notification");
            
        //add to arraylist/storage file to reference later
    }
    
}
