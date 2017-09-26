/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterfoodmodel;

import entermoodmodel.Mood;

/**
 * This contains all the attributes and methods that foods entered into the app 
 * will have associated with them.
 */
public class Food {
    private String foodName;
    private String timeEntered;
    private double foodQuantity;
    private Mood foodMood;
    /**
     * This is the default constructor for the Food class
     */
    public Food(){
        
    }
    
    /**
     * Method to get the name of the food object as a string
     * @return Name of the type of food
     */
    public String getFoodName(){
        return foodName;
    }
    
    void setFoodName(String foodName){
    }
    
    void setTimeEntered(){
        
    }
    
    void setFoodQuantity(){
        
    }
    
    void setFoodMood(){
        
    }
    /**
     * Method to get the time the food object was entered
     * @return The time the food object was entered as a string value
     */
    public String getTimeEntered(){
        return timeEntered;
    }
    
    /**
     * Method to get the name of the food object as a string
     * @return Name of the type of food
     */
    public double getFoodQuantity(){
        return foodQuantity;
    }
    
    /**
     * Gets the mood the user entered associated with this food object
     * @return The mood that was entered in association with this food object
     */
    public Mood getFoodMood(){
        return foodMood;
    }
}
