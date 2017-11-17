
package Mobile.crudfoodctrl;

import Mobile.crudmoodmodel.Mood;
import Mobile.crudfoodmodel.Food;
import Mobile.crudfoodview.FoodView;

public class FoodCtrl {
    String foodname, timeEntered, username;
    Mood mood;
    Mobile.userprofilemodel.Profile prof = MainMenu.prof;
    //username = Mobile.userprofilemodel.UserProfileModel.getUserProfile();
    /**
     * Constructor for creating FoodCtrl objects
     */
    public FoodCtrl(){
        displayView();
        
    }
    
    /**
     * This method will update the food name
     * @param foodName Name of the food entered
     */
    public void updateFoodName (String foodName) {

    }
    /**
     * This method will update the time entered
     * @param timeEntered Time food was entered
     */
    public void updateTimeEntered (String timeEntered) {

    }
    
    /**
     * This method will update the mood associated with a food
     * @param mood Mood connected to food entered
     */
    public void updateFoodMood (Mood mood) {
        
    }
    
    public void displayView () {
        Mobile.crudfoodview.FoodView view = new Mobile.crudfoodview.FoodView();
    }
    
}
