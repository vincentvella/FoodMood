package crudfoodmodel;

import crudmoodmodel.Mood;

/**
 * This contains all the attributes and methods that foods entered into the app
 * will have associated with them.
 */
public class Food {

    public String foodName;
    public String timeEntered;
    public String foodMood;

    /**
     * This is the default constructor for the Food class
     * @param _foodName
     * @param _timeEntered
     * @param _foodMood
     */
    public Food(String _foodName, String _timeEntered, String _foodMood) {
        foodName = _foodName;
        timeEntered = _timeEntered;
        foodMood = _foodMood;
    }

    /**
     * Sets the food name
     * @param _foodName 
     */
    void setFoodName(String _foodName) {
        foodName = _foodName;
    }

    /**
     * Sets the time entered into the system
     * @param _timeEntered 
     */
    void setTimeEntered(String _timeEntered) {
        timeEntered = _timeEntered;
    }

    /**
     * Sets the Mood associated with the food entry
     * @param _foodMood 
     */
    void setFoodMood(String _foodMood) {
        foodMood = _foodMood;
    }

    /**
     * Gets the Food Name
     * @return 
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Gets the Time Entered
     * @return 
     */
    public String getTimeEntered() {
        return timeEntered;
    }

    /**
     * Gets the Mood associated with the food entry
     * @return 
     */
    public String getFoodMood() {
        return foodMood;
    }

}
