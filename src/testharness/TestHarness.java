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
import Mobile.crudfoodmodel.*;
import Mobile.crudmoodmodel.Mood;
import Mobile.crudmoodmodel.MoodModel;
import Mobile.userprofilemodel.Profile;
import Mobile.userprofilemodel.User;

public class TestHarness {

	/**
	 * @param args the command line arguments
	 */
	public static void startTests() {
		System.out.println("-------------Testing Started----------");
                runTests();
                System.out.println("-------------End of testing suite------------");
	}
        
        /**
         * This method will run the testing suite.
         */
        private static void runTests() {
            System.out.println("Testing Mobile Suite");
            //<editor-fold defaultstate="collapsed" desc="Creating Test Objects">
            System.out.println("--Creating Test Objects");
            User user = new User("testUser", "testPassword");
            Profile profile = new Profile(user, "test", "user", "testuser@testing.io", 0);
            Food food = new Food("Test Food", "2017.11.17.00.53", "Happy");
            Mood mood = new Mood("Test Mood");
            System.out.println("--Created Test Objects Successfully");
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Testing User CRUD">
            System.out.println("--Testing User CRUD");
            user.setUsername("user");
            user.setPassword("password");
            user.getUsername();
            System.out.println("--User CRUD Tests Passed");
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Testing Profile CRUD">
            System.out.println("--Testing Profile CRUD");
            if(profile.runTests(profile)){
                System.out.println("--Testing Passed");
            } else {
                System.out.println("--Testing Failed");
                System.exit(1);
            }
            System.out.println("--Profile CRUD Tests Passed");
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Testing CRUD Food">
            System.out.println("--Testing CRUD Food");
            FoodModel foodModel = new FoodModel();
            if(foodModel.testFoodModel(profile, food)){
                System.out.println("--Testing Passed");
            } else {
                System.out.println("--Testing Failed");
                System.exit(1);
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="Testing CRUD Mood">
            System.out.println("--Testing CRUD Food");
            MoodModel moodModel = new MoodModel();
            if(moodModel.testMoodModel(mood)){
                System.out.println("--Testing Passed");
            } else {
                System.out.println("--Testing Failed");
                System.exit(1);
            }
            //</editor-fold>
            
            //System.out.println("-Instantiating Chart Controller");
            //ChartController chartCtrl = new ChartController();
            //System.out.println("-Instantiating CRUD Food Controller");
            //FoodCtrl foodCtrl = new FoodCtrl();
            //System.out.println("-Instantiating CRUD Mood Controller");
            //MoodCtrl moodCtrl = new MoodCtrl();
            //System.out.println("-Instantiating History Controller");
            //HistoryController historyCtrl = new HistoryController();
            //System.out.println("-Instantiating Notifications Controller");
            //NotificationsController notificationsCtl = new NotificationsController();
            //System.out.println("-Instantiating Recommendations Controller");
            //RecommendController recommendCtrl = new RecommendController();
            //System.out.println("-Instantiating Relations Controller");
            //RelationsController relationsCtrl = new RelationsController();
            //System.out.println("-Instantiating Stats Controller");
            //FoodStat foodStat = new FoodStat();
            //MoodStat moodStat = null;
            //StatController statCtrl = new StatController(foodStat, moodStat);
            //System.out.println("-Instantiating User Profile Controller");
            //UserProfileCtrl userprofctrl = new UserProfileCtrl();
            //System.out.println("-Instantiating Correlation Controller");
            //CorrelationController correlationctrl = new CorrelationController();
        }
}
