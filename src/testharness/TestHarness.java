package testharness;

import Analytic.statsmodel.FoodStat;
import Analytic.statsmodel.MoodStat;
import Mobile.userprofilectrl.UserProfileCtrl;
import Analytic.statsctrl.StatController;
import Analytic.chartcorrelationctrl.ChartController;
import Mobile.crudfoodctrl.FoodCtrl;
import Mobile.crudmoodctrl.MoodCtrl;
import Mobile.historyctrl.HistoryController;
import Mobile.notificationsctrl.NotificationsController;
import Mobile.recommendctrl.RecommendController;
import Analytic.relationsctrl.RelationsController;
import Analytic.viewcorrelationctrl.CorrelationController;

public class TestHarness {

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
            FoodStat foodStat = new FoodStat();
            MoodStat moodStat = null;
            StatController statCtrl = new StatController(foodStat, moodStat);
            System.out.println("Instantiating User Profile Controller");
            UserProfileCtrl userprofctrl = new UserProfileCtrl();
            System.out.println("Instantiating Correlation Controller");
            CorrelationController correlationctrl = new CorrelationController();
        }
}
