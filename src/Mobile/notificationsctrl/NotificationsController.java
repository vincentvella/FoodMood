package Mobile.notificationsctrl;

import Mobile.crudfoodmodel.Food;
import Mobile.notificationsmodel.NotificationsModel;
import Mobile.notificationsview.Notifications;
import Mobile.notificationsview.NotificationsView;
import java.util.Timer;
import java.util.TimerTask;

public class NotificationsController {
    Food emptyFood;
    
    public NotificationsController(Food food) {
        System.out.println("`-New notification control instantiated");
        food = emptyFood;
    }
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.println("`-Timer Started");
            new NotificationsView(emptyFood).setVisible(true);
        }
    };

    public void startTimer() {
        //120000 for 2 minutes
        System.out.println("`-Timer Started: Reminder in 2 Minutes");
        timer.schedule(task, 12000);
    }
//    public void newNotification(int type, String message){
//        //types
//        //1 - warning , 2 - info
//        System.out.println("`-Created new notification");
//            
//        //add to arraylist/storage file to reference later
//    }
}
