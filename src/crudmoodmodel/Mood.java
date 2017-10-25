/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmoodmodel;
import java.util.ArrayList;
/**
 * This class contains the different attributes and methods a Mood object will
 * potentially have associated with it.
 */
public class Mood {
    public String moodName;
    public String timeEntered;
    public ArrayList<String> associatedFoods;
    /**
     * This is the default constructor for the Mood class
     */
    public Mood(String _moodName, String _timeEntered, ArrayList<String> _associatedFoods){
        moodName = _moodName;
        timeEntered = _timeEntered;
        associatedFoods = _associatedFoods;
    }
    
    void setMoodName(){
        
    }
    
    void setTimeEntered(){
        
    }
    
    void setAssociatedFoods(){
        
    }
    
    /**
     * Method to get the name of the mood object as a string
     * @return The title of the mood
     */
    public String getMoodName(){
        return moodName;
    }
    
    /**
     * Method to get the time the mood object was entered
     * @return The time the mood object was entered as a string value
     */
    public String getTimeEntered(){
        return timeEntered;
    }
    
    /**
     * Method to get the names of different foods you associated with this mood
     * @return An ArrayList
     */
    public ArrayList<String> getAssociatedFoods(){
        return associatedFoods;
    }
}
