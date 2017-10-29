package crudmoodctrl;

import crudmoodmodel.Mood;
import crudfoodmodel.Food;
import crudmoodview.MoodView;

public class MoodCtrl {
    
     /**
     * Constructor for creating MoodCtrl objects
     */
    public MoodCtrl(){
        displayView();
    }
    
    /**
     * This method will update the mood name in the model
     * @param moodName The name of the mood
     */
    public void updateMoodName (String moodName) {

    }
    /**
     * This method will update the time entered in the model
     * @param timeEntered The time the mood was entered
     */
    public void updateTimeEntered (String timeEntered) {

    }

    /**
     * This method will update the food associated with a mood
     * @param food Food associated with mood
     */
    public void updateFoodMood (Food food) {
        
    }
    
    public void displayView(){
        System.out.println("`-Instantiating Mood object");
        //Mood mood = new Mood();
        System.out.printf("`-F Instantiated\n`-Building MoodView\n");
        //MoodView MoodUI = new MoodView(mood);
    }
    
}
