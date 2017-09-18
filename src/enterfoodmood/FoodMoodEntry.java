/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterfoodmood;

/**
 *
 * @author Ben
 */
public class FoodMoodEntry {
    
    private String food;
    private String mood;
    
    /**
     * This is the default constructor for the FoodMoodEntry class
     */
    public FoodMoodEntry(){
        
    }
    
    /**
     * View allowing user to enter food consumed
     * @param food The food consumed
     * @param mood The mood provoked from consumption
     */
    public void enterFoodMood(String food, String mood){
        this.food = food;
        this.mood = mood;
    }
    
    /**
     * @return value of food
     */
    public String getFood(){
        return food;
    }
    
    
    /**
     * @return  value of mood
     */
    public String getMood(){
        return mood;
    }
    
    /**
     * @return value of food and mood
     */
    public String getFoodMood(){
        return food + " " + mood;
    }
}
