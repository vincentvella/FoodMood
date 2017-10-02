/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmoodview;
import crudmoodmodel.Mood;

public class MoodView {
   
    private Mood mood;
    private String moodName;
    
    /**
     * This is the default constructor for the FoodMoodEntry class
     */
    public MoodView(){
        
    }
    
    /**
     * Constructor with known mood as parameter
     * @param mood Mood to be used
     */
    public MoodView(Mood mood){
        
    }
    
    /**
     * View allowing user to enter food consumed
     * @param mood The mood provoked from consumption
     */
    public void enterMood(Mood mood){
        this.mood = mood;
    }
    
    /**
     * @return  value of mood
     */
    public Mood getMood(){
        return mood;
    }
    
}
