/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterfoodmoodmodel;
import java.util.ArrayList;
/**
 * This class contains the different attributes and methods a Mood object will
 * potentially have associated with it.
 */
public class Mood {
    private String foodName;
    private String timeEntered;
    private double foodQuantity;
    private ArrayList<String> associatedFoods;
    /**
     * This is the default constructor for the Mood class
     */
    public Mood(){
        
    }
    
    /**
     * Method to get the name of the mood object as a string
     * @return The title of the mood
     */
    public String getMoodName(){
        return foodName;
    }
    
    /**
     * Method to get the time the mood object was entered
     * @return The time the mood object was entered as a string value
     */
    public String getTimeEntered(){
        return timeEntered;
    }
    
    /**
     * Method to get the names of different foods associated with this mood
     * @return 
     */
    public ArrayList<String> getAssociatedFoods(){
        return associatedFoods;
    }
}
