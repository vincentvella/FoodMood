package Mobile.crudfoodmodel;

import Mobile.crudmoodmodel.Mood;

/**
 * This contains all the attributes and methods that foods entered into the app
 * will have associated with them.
 */
public class Food {

    private String foodName;
    private String timeEntered;
    private String foodMood;

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
    public void setFoodName(String f) {
        foodName = f;
    }

    /**
     * Sets the time entered into the system
     * @param t 
     */
    public void setTimeEntered(String t) {
        timeEntered = t;
    }

    /**
     * Sets the Mood associated with the food entry
     * @param fm
     */
    public void setFoodMood(String fm) {
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