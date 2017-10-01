package foodmoodv1;

import chartcorrelationctrl.ChartController;
import crudfoodctrl.FoodCtrl;
import crudmoodctrl.MoodCtrl;
import historyctrl.HistoryController;
import notificationsctrl.NotificationsController;
import recommendctrl.RecommendController;
import relationsctrl.RelationsController;
import statsctrl.StatController;
import userprofilectrl.*;
import viewcorrelationctrl.CorrelationController;

public class FoodMoodV1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("-------------Testing Started----------");
                runTests();
                System.out.println("-------------End of testing suite------------");
	}
        
        /**
         * This method will run the testing suite.
         */
        private static void runTests() {
            System.out.println("Instantiating Chart Controller");
            ChartController chartCtrl = new ChartController();
            System.out.println("Instantiating CRUD Food Controller");
            FoodCtrl foodCtrl = new FoodCtrl();
            System.out.println("Instantiating CRUD Mood Controller");
            MoodCtrl moodCtrl = new MoodCtrl();
            System.out.println("Instantiating History Controller");
            HistoryController historyCtrl = new HistoryController();
            System.out.println("Instantiating Notifications Controller");
            NotificationsController notificationsCtl = new NotificationsController();
            System.out.println("Instantiating Recommendations Controller");
            RecommendController recommendCtrl = new RecommendController();
            System.out.println("Instantiating Relations Controller");
            RelationsController relationsCtrl = new RelationsController();
            System.out.println("Instantiating Stats Controller");
            StatController statCtrl = new StatController();
            System.out.println("Instantiating User Profile Controllers");
            UserInfo userInfoCtrl = new UserInfo();
            UserSettings userSettings = new UserSettings();
            System.out.println("Instantiating Correlation Controller");
            CorrelationController correlationctrl = new CorrelationController();
        }
}
