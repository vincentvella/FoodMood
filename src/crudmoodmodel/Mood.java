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
    
    /**
     * Mood Constructor
     * @param _moodName
     */
    public Mood(String _moodName){
        moodName = _moodName;
    }
    
    /**
     * Set's Mood name
     * @param _name 
     */
    public void setMoodName(String _name){
        moodName = _name;
    }
    
    /**
     * Method to get the name of the mood object as a string
     * @return The title of the mood
     */
    public String getMoodName(){
        return moodName;
    }
}
