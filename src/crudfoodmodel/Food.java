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
     * @param f
     * @param t
     * @param _foodMood
     */
    public Food(String f, String t, String _foodMood) {
        foodName = f;
        timeEntered = t;
        foodMood = _foodMood;
    }

    /**
     * Sets the food name
     * @param f 
     */
    void setFoodName(String f) {
        foodName = f;
    }

    /**
     * Sets the time entered into the system
     * @param t 
     */
    void setTimeEntered(String t) {
        timeEntered = t;
    }

    /**
     * Sets the Mood associated with the food entry
     * @param fm
     */
    void setFoodMood(String fm) {
        foodMood = fm;
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
